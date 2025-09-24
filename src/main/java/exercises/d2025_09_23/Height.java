package exercises.d2025_09_23;

import java.util.Scanner;

public class Height {
	static final float CM_PER_INCH = 2.54f;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your height in inches: ");
		float heightInInches = in.nextFloat();

		float heightInCm = heightInInches * CM_PER_INCH;

		System.out.printf("Your height in centimeters is: %.2f cm%n", heightInCm);

		in.close();
	}
}
