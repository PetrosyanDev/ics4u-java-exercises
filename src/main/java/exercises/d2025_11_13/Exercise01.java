/*
 * Student: © Erik Petrosyan
 * Date: 11/13/2025
 */

package exercises.d2025_11_13;

import java.util.Scanner;
import java.util.Random;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Exercise01 - 11/13/2025");

        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        // Activity 1
        String[] names = { "Esther", "Deryck", "Erik" };

        // Activity 2
        String[] food = {};

        // Activity 3
        String[] a = { "a", "b", "c", "d", "e" };
        for (int i = 0; i <= a.length; i++) { // ERROR
            System.out.println(a[i]);
        }

        // Activity 4
        for (int i = 0; i < a.length; i++) { // CORRECTED
            System.out.println(a[i]);
        }

        // Practice
        // #1
        String[] careers1 = { "UofT - Rotman", "York - Schulich", "TMU - BCom" };

        // #2
        boolean[] randBools = new boolean[20];
        int heads = 0; // true
        int tails = 0; // false

        for (int i = 0; i < randBools.length; i++) {
            randBools[i] = rand.nextBoolean();
            if (randBools[i]) {
                heads++;
            } else {
                tails++;
            }
        }

        // #3
        int[] randInts = new int[20];

        for (int i = 0; i < randInts.length; i++) {
            randInts[i] = (int) rand.nextInt(6) + 1;
        }

        // #4
        System.out.println("\n#4");
        String[] items = { "Laptop", "Mouse", "Keyboard", "Monitor", "Webcam", "Headphones" };
        String[] items2 = { "Laptop", "Mouse", "Keyboard", "Monitor", "Webcam", "Headphones" };
        boolean found = false;

        String input = s.nextLine();

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(input)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Item found!");
        } else {
            System.out.println("Item not found!");
        }

        // #5
        int[] rand5Ints = new int[5];

        for (int i = 0; i < randInts.length; i++) {
            randInts[i] = (int) rand.nextInt(20) + 1;
        }

        int maxElement = randInts[0];

        for (int i = 1; i < randInts.length; i++) {
            if (randInts[i] > maxElement) {
                maxElement = randInts[i];
            }
        }

        System.out.printf("Max element in the array is: %d%n", maxElement);

        // #7 remove index element from array | Note: the size of array stays the same
        int[] sampleArr = { 1, 2, 3, 4, 5 };
        int index = 2;

        for (int i = index; i < sampleArr.length - 1; i++) {
            sampleArr[i] = sampleArr[i + 1];
        }

        // #8
        System.out.println("\n#8");
        int[] playerScores = new int[10];

        for (int i = 0; i < playerScores.length; i++) {
            String test = s.nextLine();
        }

    }
}
