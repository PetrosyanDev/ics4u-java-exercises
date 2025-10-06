package exercises.d2025_09_29;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int digitSum = hundreds + tens + ones;

        System.out.println("Number: " + number);
        System.out.println("Digit sum: " + digitSum);

        input.close();
    }
}
