/*
 * Student: © Erik Petrosyan
 * Date: 09/18/2025
 */

package assignments.d2025_09_18;

public class TicTacToe {
    static int width = 49; // 3n+1
    static int height = 12; // 3n

    public static void main(String[] args) {
        System.out.println("Assignment 01 - 09/18/2025");

        String dashLine = "-".repeat(width);
        String emptyLine = "|" + (" ".repeat(width / 3 - 1) + "|").repeat(3);

        String[][] game = new String[][] { { "X", "O", "X" }, { "X", "X", "O" }, { "O", "O", "X" } };

        for (String[] row : game) {
            System.out.println(dashLine);
            System.out.printf((emptyLine + "%n").repeat(height / 6));
            System.out.println(GetLineWithValues(row));
            System.out.printf((emptyLine + "%n").repeat(height / 6));
        }
        System.out.printf(dashLine);
    }

    private static String GetLineWithValues(String[] s) {
        String res = "|";
        for (int i = 0; i < 3; i++) {
            res += " ".repeat(width / 6 - 1) + s[i] + " ".repeat(width / 6 - 1) + "|";
        }
        return res;
    }

}
