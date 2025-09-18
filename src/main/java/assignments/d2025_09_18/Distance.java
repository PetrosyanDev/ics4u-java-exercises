/*
 * Student: © Erik Petrosyan
 * Date: 09/18/2025
 */

package assignments.d2025_09_18;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Assignment 01 - 09/18/2025");

        double x1 = 50;
        double y1 = 100;
        double x2 = 75;
        double y2 = 80;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // The distance between the points (50, 100) and (75, 80) use printf
        System.out.printf("The distance between the points (%2.0f, %2.0f) and (%2.0f, %2.0f) is: %.1f%n", x1, y1, x2,
                y2,
                distance);

    }
}
