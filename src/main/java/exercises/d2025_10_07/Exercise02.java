/*
 * Student: © Erik Petrosyan
 * Date: 10/07/2025
 */

package exercises.d2025_10_07;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Exercise02 - 10/07/2025");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        if (score >= 70) {
            if (score >= 90) {
                System.out.println("Excellent! Grade: A");
            } else {
                System.out.println("Good job! Grade: B");
            }
        } else {
            System.out.println("You can do better. Grade: C");
        }

        scanner.close();
    }
}
