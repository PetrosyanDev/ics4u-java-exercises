/*
 * Student: © Erik Petrosyan
 * Date: 09/24/2025
 */

package exercises.d2025_09_24;

public class Exercise01 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = Double.parseDouble(in.nextLine().trim());

        double area = Math.PI * r * r;
        double circ = 2 * Math.PI * r;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circ);

        in.close();
    }
}
