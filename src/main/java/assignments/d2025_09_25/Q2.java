/*
 * Students: Erik Petrosyan and Ruan Viesti Moraes
 * Main: Ruan
 * Date: 09/25/2025
 */
package assignments.d2025_09_25;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your birthdate...");
        System.out.println();

        System.out.printf("%-10s", "Year: ");
        int yearBorn = s.nextInt();

        System.out.printf("%-10s", "Month: ");
        int monthBorn = s.nextInt();

        System.out.printf("%-10s", "Day: ");
        int dayBorn = s.nextInt();

        System.out.println();
        System.out.println("Enter today's date: ");
        System.out.println();

        System.out.printf("%-10s", "Year: ");
        int yearToday = s.nextInt();

        System.out.printf("%-10s", "Month: ");
        int monthToday = s.nextInt();

        System.out.printf("%-10s", "Day: ");
        int dayToday = s.nextInt();

        int days = ((yearToday - yearBorn) * 365) + ((monthToday - monthBorn) * 30) + (dayToday - dayBorn);
        int sleepHours = days * 8;

        System.out.println();
        System.out.printf("You have been alive for %,d days!\n", days);
        System.out.printf("You have slept for %,d hours!\n", sleepHours);

    }
}
