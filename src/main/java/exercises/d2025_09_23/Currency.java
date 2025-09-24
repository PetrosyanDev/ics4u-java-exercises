package exercises.d2025_09_23;

import java.util.Scanner;

public class Currency {

	static final float USD_PER_CAD = 10f / 9f;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the amount in USD: ");
		float usd = in.nextFloat();

		float cad = usd * USD_PER_CAD;

		System.out.printf("The equivalent in CAD is: $%,.2f%n", cad);

		in.close();
	}
}
