package exercises.d2025_09_29;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = promptForThreeDigitNumber(in);

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int digitSum = hundreds + tens + ones;

        System.out.printf("Number: %d%n", number);
        System.out.printf("Digit sum: %d%n", digitSum);

        in.close();
    }

    private static int promptForThreeDigitNumber(Scanner in) {
        while (true) {
            System.out.print("Enter a three-digit number: ");
            String line = in.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                if (value >= 100 && value <= 999) {
                    return value;
                }
                System.out.println("Please enter a number between 100 and 999.");
            } catch (NumberFormatException ex) {
                System.out.println("Please enter digits only.");
            }
        }
    }
}
