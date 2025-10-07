/*
 * Student: © Erik Petrosyan
 * Date: 10/07/2025
 */

package exercises.d2025_10_07;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Exercise01 - 10/07/2025");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume trailing newline

        System.out.print("Coupon? (true/false): ");
        boolean hasCoupon = scanner.nextBoolean();

        int finalPrice;
        if (age < 13) {
            finalPrice = 8;
        } else {
            finalPrice = 12;
        }

        if (hasCoupon) {
            finalPrice -= 2;
        }

        System.out.println("Final ticket price: $" + finalPrice);

        scanner.close();
    }
}
