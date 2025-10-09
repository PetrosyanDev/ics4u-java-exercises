package assignments.d2025_10_09;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Group Assignment Ex.3 - 10/09/2025\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter performance rating (1-5): ");
        int performanceRating = scanner.nextInt();
        if (performanceRating < 1 || performanceRating > 5) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService < 0) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        int bonus;
        if (yearsOfService >= 5) {
            if (performanceRating == 5) {
                bonus = 5000;
            } else if (performanceRating == 4) {
                bonus = 3000;
            } else {
                bonus = 1000;
            }
        } else {
            bonus = 500;
        }

        System.out.printf("Total bonus: $%,d%n", bonus);

        scanner.close();
    }
}
