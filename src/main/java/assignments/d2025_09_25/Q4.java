/*
 * Students: Erik Petrosyan and Ruan Viesti Moraes
 * Main: Ruan
 * Date: 09/25/2025
 */
package assignments.d2025_09_25;

public class Q4 {
    public static void main(String[] args) {
        String item1 = "WD 2TB External Hard Drive";
        String item2 = "ASUS 24\" LED Monitor";

        double hardDrive = 99.99;
        double monitor = 249.99;
        double subtotal = hardDrive + monitor;
        double hst = 13.0 / 100;
        double hstValue = subtotal * hst;
        double total = subtotal + hstValue;
        System.out.println();
        System.out.printf("%-5s %-30s %14s\n", "QTY", "ITEM", "PRICE");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5d %-38s $%4.2f\n", 1, item1, hardDrive);
        System.out.printf("%-5d %-37s $%4.2f\n", 1, item2, monitor);
        System.out.println("----------------------------------------------------");
        System.out.printf("      %-37s $%4.2f\n", "Subtotal", subtotal);
        System.out.printf("      %-39s %4.2f\n", "HST:", hstValue);
        System.out.printf("      %-37s $%4.2f\n", "GRAND TOTAL:", total);

        System.out.println();
    }
}
