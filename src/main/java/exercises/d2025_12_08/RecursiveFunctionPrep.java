/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

public class RecursiveFunctionPrep {
    public static void main(String[] args) {
        System.out.println("Exercise03 - 12/08/2025");

        System.out.println(fibonachi(6));
    }

    private static int fibonachi(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}
