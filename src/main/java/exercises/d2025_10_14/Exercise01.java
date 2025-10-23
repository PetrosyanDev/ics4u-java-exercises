/*
 * Student: © Erik Petrosyan
 * Date: 10/14/2025
 */

package exercises.d2025_10_14;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter traffic light color (RED, YELLOW, GREEN): ");
        String color = scanner.nextLine().trim().toUpperCase();

        switch (color) {
            case "RED":
                System.out.println("Stop");
                break;
            case "YELLOW":
                System.out.println("Ready");
                break;
            case "GREEN":
                System.out.println("Go");
                break;
            default:
                System.out.println("Error: Unknown traffic light color.");
                break;
        }

        scanner.close();
    }
}
