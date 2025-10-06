/*
 * Student: © Erik Petrosyan
 * Date: 10/06/2025
 */

package exercises.d2025_10_06;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

        scanner.close();
    }
}
