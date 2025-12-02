/*
 * Student: © Erik Petrosyan
 * Date: 11/20/2025
 */

package exercises.d2025_11_20;

import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Exercise01 - 11/20/2025");

        int[][] a = new int[3][2];

        for (int[] row : a) {
            Arrays.fill(row, 4);
        }

        System.out.println(Arrays.deepToString(a));

    }
}
