package exercises.d2025_09_29;

import java.util.Scanner;

public class PizzaCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pizza diameter (inches): ");
        double diameter = input.nextDouble();

        double materialsCost = 0.05 * diameter * diameter;
        double totalCost = 0.75 + 1.00 + materialsCost;

        System.out.println("Materials: $" + materialsCost);
        System.out.println("Total cost to make the pizza: $" + totalCost);

        input.close();
    }
}
