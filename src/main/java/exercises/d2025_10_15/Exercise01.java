/*
 * Student: © Erik Petrosyan
 * Date: 10/15/2025
 */

package exercises.d2025_10_15;

public class Exercise01 {
    public static void main(String[] args) {
        int month = 2;
        int numDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            default:
                numDays = 28;
                break;
        }

        System.out.println("Number of days: " + numDays);
    }
}
