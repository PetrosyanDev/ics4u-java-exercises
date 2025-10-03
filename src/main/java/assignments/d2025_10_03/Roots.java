package assignments.d2025_10_03;

import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        System.out.println("Group Assignment - 10/03/2025\n");

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double sqrtDiscriminant = Math.sqrt(discriminant);

        // Find the roots
        double root1 = (-b + sqrtDiscriminant) / (2 * a);
        double root2 = (-b - sqrtDiscriminant) / (2 * a);

        // Print out the roots
        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);
    }
}
