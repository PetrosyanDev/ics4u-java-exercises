/*
 * Student: © Erik Petrosyan
 * Date: 09/24/2025
 */

package exercises.d2025_09_23;

public class Exercise02 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("What's your name? ");
        String name = in.nextLine();

        System.out.println("Hi " + name);
        in.close();
    }
}
