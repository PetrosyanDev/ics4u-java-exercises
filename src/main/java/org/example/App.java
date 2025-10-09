package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Simple runner so we can choose which exercise to launch without editing build.gradle.
 *
 * Usage:
 *   ./gradlew run --args='assignments/d2025_10_09/Exercise3'
 *   ./gradlew run --args='exercises/d2025_10_06/Exercise01'
 */
public final class App {

    private App() {
        // utility class
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String targetClassName;
        try {
            targetClassName = normalizeTarget(args[0]);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
            printUsage();
            return;
        }

        String[] delegateArgs = Arrays.copyOfRange(args, 1, args.length);

        try {
            invokeTarget(targetClassName, delegateArgs);
        } catch (ClassNotFoundException e) {
            System.err.printf("Could not find class '%s'.%n", targetClassName);
            printUsage();
        } catch (NoSuchMethodException e) {
            System.err.printf("Class '%s' does not have a public static void main(String[]).%n", targetClassName);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            System.err.printf("Target '%s' threw an exception: %s%n", targetClassName, cause);
            cause.printStackTrace(System.err);
        } catch (IllegalAccessException e) {
            System.err.printf("Cannot access main(String[]) on '%s'.%n", targetClassName);
        }
    }

    private static void invokeTarget(String className, String[] args)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> targetClass = Class.forName(className);
        Method main = targetClass.getMethod("main", String[].class);
        main.invoke(null, (Object) args);
    }

    private static String normalizeTarget(String raw) {
        String candidate = raw.trim();
        if (candidate.isEmpty()) {
            throw new IllegalArgumentException("No class name provided.");
        }

        if (candidate.contains("/")) {
            candidate = candidate.replace('/', '.');
        }

        if (!candidate.contains(".")) {
            candidate = "exercises." + candidate;
        }

        return candidate;
    }

    private static void printUsage() {
        System.out.println("Usage: ./gradlew run --args='<package/ClassName>'");
        System.out.println("Examples:");
        System.out.println("  ./gradlew run --args='assignments/d2025_10_09/Exercise3'");
        System.out.println("  ./gradlew run --args='exercises/d2025_10_06/Exercise01'");
    }
}

