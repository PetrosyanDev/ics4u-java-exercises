/*
 * Student: © Erik Petrosyan
 * Date: 11/04/2025
 */

package exercises.d2025_11_04;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Exercise01 - 11/04/2025");

        // #1
        char c = 'a';

        if (Character.isDigit(c)) {
            System.out.println("c is a digit");
        } else if (Character.isLetter(c)) {
            System.out.println("c is a letter");
        } else if (Character.isWhitespace(c)) {
            System.out.println("c is a whitespace");
        } else {
            System.out.println("c is a special character");
        }
    }
}
