/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

import java.util.Scanner;

public class StringBuilderPrep2 {
    public static void main(String[] args) {
        System.out.println("Exercise02 - 12/08/2025");

        StringBuilder builder = new StringBuilder();
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        for (char c : str.toCharArray()) {

            if (c != 'a') {
                builder.append(c);
            }
        }

        System.out.println(builder);
    }
}
