/*
 * Student: © Erik Petrosyan
 * Date: 10/14/2025
 */

package exercises.d2025_10_14;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid operator. Use one of +, -, *, /.");
                break;
        }

        scanner.close();
    }
}
