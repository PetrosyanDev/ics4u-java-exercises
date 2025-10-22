package assignments.d2025_10_22;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int discount;

        do {

            System.out.print("\nEnter Amount: ");
            int amount = s.nextInt();
            s.nextLine();

            if (amount > 10000) {
                discount = 20;
            } else if (amount >= 5000) {
                discount = 10;
            } else if (amount >= 1000) {
                discount = 5;
            } else {
                discount = 0;
            }

            System.out.println(amount - discount);

            System.out.print("\nDo you want to continue (y/n)? ");

            if (!s.nextLine().toLowerCase().equals("y")) {
                break;
            }
        } while (true);

        s.close();
    }
}
