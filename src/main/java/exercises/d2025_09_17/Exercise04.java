/*
 * Student: © Erik Petrosyan
 * Date: 09/17/2025
 */

package exercises.d2025_09_17;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("Exercise04 - 09/17/2025");

        int width = 12;
        int height = 3;
        String fill = "\\";

        System.out.println(fill.repeat(width));
        System.out.print((fill + " ".repeat(width - 2) + fill + "\n").repeat(height - 2));
        System.out.println(fill.repeat(width));

    }
}
