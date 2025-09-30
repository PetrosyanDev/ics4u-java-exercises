package exercises.d2025_09_29;

import java.util.Scanner;

public class Drop {
    private static final double MAX_TIME_SECONDS = 4.5;
    private static final double INITIAL_HEIGHT = 100.0;
    private static final double GRAVITY_FACTOR = 4.9;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double time;
        do {
            System.out.print("Enter a drop time (seconds, less than 4.5): ");
            time = Double.parseDouble(in.nextLine().trim());
            if (time < 0 || time >= MAX_TIME_SECONDS) {
                System.out.println("Time must be between 0 and " + MAX_TIME_SECONDS + " seconds. Try again.");
            }
        } while (time < 0 || time >= MAX_TIME_SECONDS);

        double height = INITIAL_HEIGHT - GRAVITY_FACTOR * time * time;

        System.out.printf("Height after %.2f seconds: %.2f meters%n", time, height);

        in.close();
    }
}
