package exercises.d2025_09_29;

import java.util.Scanner;

public class Alive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int birthYear = input.nextInt();
        System.out.print("Month: ");
        int birthMonth = input.nextInt();
        System.out.print("Day: ");
        int birthDay = input.nextInt();

        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int currentYear = input.nextInt();
        System.out.print("Month: ");
        int currentMonth = input.nextInt();
        System.out.print("Day: ");
        int currentDay = input.nextInt();

        int birthTotalDays = birthYear * 365 + birthMonth * 30 + birthDay;
        int currentTotalDays = currentYear * 365 + currentMonth * 30 + currentDay;

        int daysAlive = currentTotalDays - birthTotalDays;
        int hoursSlept = daysAlive * 8;

        System.out.println("You have been alive for " + daysAlive + " days.");
        System.out.println("You have slept " + hoursSlept + " hours.");

        input.close();
    }
}
