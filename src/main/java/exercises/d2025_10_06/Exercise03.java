/*
 * Student: © Erik Petrosyan
 * Date: 10/06/2025
 */

package exercises.d2025_10_06;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        if ("+".equals(operator)) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if ("-".equals(operator)) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if ("*".equals(operator)) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else if ("/".equals(operator)) {
            if (secondNumber == 0.0) {
                System.out.println("Error: cannot divide by zero.");
            } else {
                System.out.println("Result: " + (firstNumber / secondNumber));
            }
        } else {
            System.out.println("Error: unsupported operator.");
        }

        scanner.close();
    }
}
