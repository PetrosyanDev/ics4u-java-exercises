package exercises.d2025_09_29;

import java.util.Scanner;

public class PizzaCost {
    private static final double LABOUR_COST = 0.75;
    private static final double RENT_COST = 1.00;
    private static final double MATERIAL_RATE = 0.05;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter pizza diameter (inches): ");
        double diameter = Double.parseDouble(in.nextLine().trim());

        double materialsCost = MATERIAL_RATE * diameter * diameter;
        double totalCost = LABOUR_COST + RENT_COST + materialsCost;

        System.out.printf("Materials: $%.2f%n", materialsCost);
        System.out.printf("Total cost to make the pizza: $%.2f%n", totalCost);

        in.close();
    }
}
