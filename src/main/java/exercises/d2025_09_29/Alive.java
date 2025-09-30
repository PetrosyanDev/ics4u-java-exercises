package exercises.d2025_09_29;

import java.util.Scanner;

public class Alive {
    private static final int HOURS_SLEPT_PER_DAY = 8;
    private static final int DAYS_PER_YEAR = 365;
    private static final int DAYS_PER_MONTH = 30;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        int birthYear = promptForInt(in, "Year: ");
        int birthMonth = promptForInt(in, "Month: ");
        int birthDay = promptForInt(in, "Day: ");

        System.out.println("Enter today's date:");
        int currentYear = promptForInt(in, "Year: ");
        int currentMonth = promptForInt(in, "Month: ");
        int currentDay = promptForInt(in, "Day: ");

        int birthTotalDays = toTotalDays(birthYear, birthMonth, birthDay);
        int currentTotalDays = toTotalDays(currentYear, currentMonth, currentDay);

        int daysAlive = currentTotalDays - birthTotalDays;
        if (daysAlive < 0) {
            System.out.println("Error: current date must not be before birthdate.");
            in.close();
            return;
        }

        int hoursSlept = daysAlive * HOURS_SLEPT_PER_DAY;

        System.out.printf("You have been alive for %d days.%n", daysAlive);
        System.out.printf("You have slept %d hours.%n", hoursSlept);

        in.close();
    }

    private static int promptForInt(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = in.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static int toTotalDays(int year, int month, int day) {
        return year * DAYS_PER_YEAR + month * DAYS_PER_MONTH + day;
    }
}
