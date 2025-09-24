/*
 * Student: © Erik Petrosyan
 * Date: 09/24/2025
 */

package exercises.d2025_09_23;

public class Exercise03 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("What's your name? ");
        String name = in.nextLine();

        System.out.print("How old are you? ");
        int age = Integer.parseInt(in.nextLine().trim());

        System.out.println("So you are " + name + " and you are " + age);
        in.close();
    }
}
