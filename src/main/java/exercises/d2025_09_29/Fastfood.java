package exercises.d2025_09_29;

import java.util.Scanner;

public class Fastfood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of burgers: ");
        int burgers = input.nextInt();

        System.out.print("Number of fries: ");
        int fries = input.nextInt();

        System.out.print("Number of sodas: ");
        int sodas = input.nextInt();

        double burgerTotal = burgers * 1.69;
        double friesTotal = fries * 1.09;
        double sodaTotal = sodas * 0.99;
        double subtotal = burgerTotal + friesTotal + sodaTotal;
        double pst = subtotal * 0.08;
        double gst = subtotal * 0.05;
        double total = subtotal + pst + gst;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("PST (8%): $" + pst);
        System.out.println("GST (5%): $" + gst);
        System.out.println("Total: $" + total);

        System.out.print("Amount tendered: ");
        double paid = input.nextDouble();
        double changeDue = paid - total;

        System.out.println("Change due: $" + changeDue);

        input.close();
    }
}
