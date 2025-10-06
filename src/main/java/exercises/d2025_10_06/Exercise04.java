/*
 * Student: © Erik Petrosyan
 * Date: 10/06/2025
 */

package exercises.d2025_10_06;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age < 13) {
            System.out.println("The person is a child.");
        } else if (age <= 19) {
            System.out.println("The person is a teenager.");
        } else {
            System.out.println("The person is an adult.");
        }

        scanner.close();
    }
}
