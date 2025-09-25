/*
 * Student: © Erik Petrosyan
 * Date: 09/24/2025
 */

package exercises.d2025_09_24;

public class Exercise02 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Enter length: ");
        double length = Double.parseDouble(in.nextLine().trim());

        System.out.print("Enter width: ");
        double width = Double.parseDouble(in.nextLine().trim());

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area: " + Math.round(area));
        System.out.println("Perimeter: " + Math.round(perimeter));

        in.close();
    }
}
