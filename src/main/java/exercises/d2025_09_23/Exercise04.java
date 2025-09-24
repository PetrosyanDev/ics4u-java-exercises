/*
 * Student: © Erik Petrosyan
 * Date: 09/24/2025
 */

package exercises.d2025_09_23;

public class Exercise04 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Please enter word #1: ");
        String w1 = in.next();

        System.out.print("Please enter word #2: ");
        String w2 = in.next();

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1 + "\t" + w2);

        in.close();
    }
}

