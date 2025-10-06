package exercises.d2025_09_29;

import java.util.Scanner;

public class Drop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a drop time less than 4.5 seconds: ");
        double time = input.nextDouble();

        if (time < 0 || time >= 4.5) {
            System.out.println("Time must be between 0 and 4.5 seconds.");
        } else {
            double height = 100.0 - 4.9 * time * time;
            System.out.println("Height after " + time + " seconds: " + height + " meters");
        }

        input.close();
    }
}
