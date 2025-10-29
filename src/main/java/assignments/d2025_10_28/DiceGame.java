/*
 * Student: © Erik Petrosyan and Ruan Viesti Moares
 * Date: 10/28/2025
 */

package assignments.d2025_10_28;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        // Initialize rand and scanner
        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        // Player information
        int points = 500;
        int wager;

        System.out.println("\nGroup Assignment - 10/28/2025");
        System.out.println("DICE GAME");

        // Main loop
        while (true) {
            if (points <= 0) {
                System.out.print("GAME OVER! Play again (Y or N)? ");
                String again = s.next();
                if (again.equalsIgnoreCase("Y")) {
                    points = 500;
                    continue;
                } else {
                    System.out.println("Thanks for playing! Goodbye!");
                    break;
                }
            }

            System.out.printf("\nYou have %d points.%n", points);
            System.out.print("Enter points to wager (-1 to QUIT): ");

            // Input check
            if (!s.hasNextInt()) {
                s.next();
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            wager = s.nextInt();

            // check if wager is correct
            if (wager == -1) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            } else if (wager < 0) {
                System.out.println("You must wager more than 0 points.");
                continue;
            } else if (wager == 0) {
                System.out.println("You must wager at least one (1) point.");
                continue;
            } else if (wager > points) {
                System.out.println("You cannot wager more than your current points.");
                continue;
            }

            // Dice rolls
            int dice1P = rand.nextInt(6) + 1;
            int dice2P = rand.nextInt(6) + 1;
            int dice1C = rand.nextInt(6) + 1;
            int dice2C = rand.nextInt(6) + 1;

            // Output dice rolls
            System.out.printf("%nYou rolled [%d][%d]%n", dice1P, dice2P);
            System.out.printf("Computer rolled [%d][%d]%n%n", dice1C, dice2C);

            int playerSum = dice1P + dice2P;
            int compSum = dice1C + dice2C;

            // Output results
            if (playerSum > compSum) {
                // if user won
                points += wager;
                System.out.printf("You win %d points!%n", wager);
            } else if (playerSum < compSum) {
                // if user loses
                points -= wager;
                System.out.printf("You lose %d points.%n", wager);
            } else {
                // if tie, ask user to reroll or pass
                while (true) {
                    System.out.print("It's a tie! Enter 'R' to roll again or 'P' to pass: ");
                    String choice = s.next();

                    // Wait for user to enter R
                    if (choice.equalsIgnoreCase("R")) {

                        // roll the dice again
                        dice1P = rand.nextInt(6) + 1;
                        dice2P = rand.nextInt(6) + 1;
                        dice1C = rand.nextInt(6) + 1;
                        dice2C = rand.nextInt(6) + 1;

                        // output dice rolls
                        System.out.printf("You rolled [%d][%d]%n", dice1P, dice2P);
                        System.out.printf("Computer rolled [%d][%d]%n", dice1C, dice2C);

                        playerSum = dice1P + dice2P;
                        compSum = dice1C + dice2C;

                        // output results
                        if (playerSum > compSum) {
                            points += wager;
                            System.out.printf("You win %d points!%n", wager);
                        } else if (playerSum < compSum) {
                            points -= wager;
                            System.out.printf("You lose %d points.%n", wager);
                        } else {
                            System.out.println("Still a tie! No points won or lost.");
                            continue;
                        }
                        break;
                    } else if (choice.equalsIgnoreCase("P")) {
                        // if user passes
                        System.out.println("You passed. No points won or lost.");
                        break;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }
            }
        }

        s.close();
    }
}
