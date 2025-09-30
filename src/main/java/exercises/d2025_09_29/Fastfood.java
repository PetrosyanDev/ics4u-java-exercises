package exercises.d2025_09_29;

import java.util.Scanner;

public class Fastfood {
    private static final double BURGER_PRICE = 1.69;
    private static final double FRIES_PRICE = 1.09;
    private static final double SODA_PRICE = 0.99;
    private static final double PST_RATE = 0.08;
    private static final double GST_RATE = 0.05;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of burgers: ");
        int burgers = Integer.parseInt(in.nextLine().trim());

        System.out.print("Number of fries: ");
        int fries = Integer.parseInt(in.nextLine().trim());

        System.out.print("Number of sodas: ");
        int sodas = Integer.parseInt(in.nextLine().trim());

        double burgerTotal = burgers * BURGER_PRICE;
        double friesTotal = fries * FRIES_PRICE;
        double sodaTotal = sodas * SODA_PRICE;
        double subtotal = burgerTotal + friesTotal + sodaTotal;
        double pst = subtotal * PST_RATE;
        double gst = subtotal * GST_RATE;
        double total = subtotal + pst + gst;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("PST (8%%): $%.2f%n", pst);
        System.out.printf("GST (5%%): $%.2f%n", gst);
        System.out.printf("Total: $%.2f%n", total);

        System.out.print("Amount tendered: ");
        double paid = Double.parseDouble(in.nextLine().trim());

        double changeDue = paid - total;
        if (changeDue < 0) {
            System.out.printf("Insufficient amount. Need $%.2f more.%n", Math.abs(changeDue));
        } else {
            System.out.printf("Change due: $%.2f%n", changeDue);
        }

        in.close();
    }
}
