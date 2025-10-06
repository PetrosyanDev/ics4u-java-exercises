package exercises.d2025_09_29;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        double first = input.nextDouble();

        System.out.print("Enter second value: ");
        double second = input.nextDouble();

        System.out.print("Enter third value: ");
        double third = input.nextDouble();

        double average = (first + second + third) / 3.0;

        System.out.println("Average: " + average);

        input.close();
    }
}
