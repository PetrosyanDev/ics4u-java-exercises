package assignments.d2025_10_09;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type number of the month: ");
        int month = sc.nextInt();

        if (month > 0 && month < 13) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("This month has 31 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("This month has 30 days");
            } else if (month == 2) {
                System.out.println("This month has 28 days");
            }
        } else {
            System.out.println("Invalid month");
        }

        sc.close();
    }
}
