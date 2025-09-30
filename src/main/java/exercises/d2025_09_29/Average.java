package exercises.d2025_09_29;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first value: ");
        double first = Double.parseDouble(in.nextLine().trim());

        System.out.print("Enter second value: ");
        double second = Double.parseDouble(in.nextLine().trim());

        System.out.print("Enter third value: ");
        double third = Double.parseDouble(in.nextLine().trim());

        double average = (first + second + third) / 3.0;

        System.out.printf("Average: %.4f%n", average);

        in.close();
    }
}
