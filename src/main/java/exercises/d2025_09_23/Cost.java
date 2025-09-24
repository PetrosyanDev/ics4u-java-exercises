package exercises.d2025_09_23;

import java.util.Scanner;

public class Cost {

	static final float TAX_RATE = 0.13f;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the cost of the item: ");
		float cost = in.nextFloat();

		float tax = cost * TAX_RATE;
		float totalCost = cost + tax;

		System.out.printf("The tax for the item is: $%,.2f%n", tax);
		System.out.printf("The total cost with tax is: $%,.2f%n", totalCost);

		in.close();

	}
}
