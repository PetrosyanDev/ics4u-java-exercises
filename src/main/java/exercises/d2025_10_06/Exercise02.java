/*
 * Student: © Erik Petrosyan
 * Date: 10/06/2025
 */

package exercises.d2025_10_06;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double third = scanner.nextDouble();

        if (first == second && second == third) {
            System.out.println("All numbers are equal.");
        } else if (first >= second && first >= third) {
            System.out.println("The largest number is: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("The largest number is: " + second);
        } else {
            System.out.println("The largest number is: " + third);
        }

        scanner.close();
    }
}
