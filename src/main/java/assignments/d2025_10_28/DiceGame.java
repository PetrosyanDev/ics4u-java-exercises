/*
 * Student: © Erik Petrosyan and Ruan Viesti Moares
 * Date: 10/28/2025
 */

package assignments.d2025_10_28;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        // Initialize stuff
        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        // Player information
        int waiger;
        int points = 500;

        // Dices
        int dice1P, dice2P, dice1C, dice2C;

        System.out.println("\nGroup Assignment - 10/28/2025");
        System.out.println("DICE GAME");

        // Main loop
        while (true) {

            System.out.printf("\nYou have %d points.%n", points);
            System.out.print("Enter points to waiger (-1 to QUIT) ");

            // Scan the input
            waiger = s.nextInt();

            if (waiger == -1) {
                // if user wants to quit
                break;
            } else if (waiger < 0 || waiger > points) {
                // Invalid input
                System.out.println("Invalid input. Try again");
                continue;
            } else if (waiger == 0) {
                // Invalid input (0)
                System.out.println("You must waiger at least (1) point.");
                continue;
            }

            // Roll the dices
            dice1P = rand.nextInt(6) + 1;
            dice2P = rand.nextInt(6) + 1;
            dice1C = rand.nextInt(6) + 1;
            dice2C = rand.nextInt(6) + 1;

            // Print the results
            System.out.printf("You rolled a [%d][%d]%n", dice1P, dice2P);
            System.out.printf("Computer rolled a [%d][%d]%n%n", dice1C, dice2C);

            if ((dice1P + dice2P) > (dice1C + dice2C)) {
                // Player Won
                points += waiger;
                System.out.printf("You win %d points.%n", waiger);
            } else if ((dice1P + dice2P) < (dice1C + dice2C)) {
                // Player Lost
                points -= waiger;
                System.out.printf("You lose %d points.%n", waiger);
            } else {
                // If it is a tie
                System.out.println("It's a tie!\n");

                // ask user if they want to play again
                System.out.print("It's a tie! Enter 'R' to roll again: ");
                if (!s.next().equalsIgnoreCase("R"))
                    break;
                else
                    continue;
            }

            // Check if game ended
            if (points <= 0) {
                System.out.print("GAME OVER! Play again (Y/N)? ");
                if (s.next().equalsIgnoreCase("Y"))
                    points = 500;
                else
                    break;
            }

        }

        System.out.println("Thanks for playing! Goodbye!");
    }
}
