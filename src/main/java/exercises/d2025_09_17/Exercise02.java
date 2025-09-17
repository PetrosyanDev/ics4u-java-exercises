/*
 * Student: © Erik Petrosyan
 * Date: 09/17/2025
 */

package exercises.d2025_09_17;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Exercise02 - 09/17/2025");

        // 5
        System.out.println(5);
        // ^^^3
        System.out.println("^".repeat(3) + 3);
        // 5*2=10
        System.out.println("5*2=" + (5 * 2));
        // My name is^^^^^^^^George!!!!
        System.out.println("My name is" + "^".repeat(8) + "George!!!");
        // 3.0^^^10.563^^harry
        System.out.println(3.0 + "^".repeat(3) + 10.563 + "^".repeat(2) + "harry");
        // >
        // >
        // >
        System.out.println(">%n>%n>%n");
        // I^think^I^got^it!
        System.out.println("I think I got it!".replace(" ", "^"));
    }
}
