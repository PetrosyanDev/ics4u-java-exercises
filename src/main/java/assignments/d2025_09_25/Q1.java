/*
 * Students: Erik Petrosyan and Ruan Viesti Moraes
 * Main: Erik
 * Date: 09/25/2025
 */
package assignments.d2025_09_25;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        // PART A
        final float burger_cost = 2.99f;
        final float fries_cost = 1.99f;
        final float pop_cost = 0.99f;
        final float HST = 0.13f;

        Scanner s = new Scanner(System.in);

        System.out.printf("%-30s", "Enter the number of burgers:");
        int burgers = s.nextInt();

        System.out.printf("%-30s", "Enter the number of fries:");
        int fries = s.nextInt();

        System.out.printf("%-30s", "Enter pop quantity:");
        int pops = s.nextInt();

        System.out.println();

        float subtotal = burger_cost * burgers + fries_cost * fries + pop_cost * pops;
        float hst = subtotal * HST;
        float total = subtotal + hst;

        System.out.printf("%-23s%8s\n", "SUBTOTAL:", String.format("$%.2f", subtotal));
        System.out.printf("%-23s%8s\n", "HST:", String.format("$%.2f", hst));
        System.out.printf("%-23s%8s\n", "GRAND TOTAL:", String.format("$%.2f", total));

        // PART B
        System.out.println();

        System.out.printf("%-26s", "AMOUNT TENDERED:");
        float tendered = s.nextFloat();

        float change = tendered - total;

        System.out.printf("%-23s%8s\n", "CHANGE:", String.format("$%.2f", change));
    }
}
