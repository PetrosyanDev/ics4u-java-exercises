/*
 * Students: © Amatul Noor, Erik Petrosyan
 * Date: 11/06/2025
 */

package assignments.d2025_11_06;

import java.util.Random;
import java.util.Scanner;

public class DriversLicense {
    public static void main(String[] args) {
        System.out.println("\nGroup Assignment - 11/06/2025");

        // initializing variables
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        // User surname
        System.out.print("\nPlease enter your surname: ");
        String surname = s.nextLine();

        // User birthdate
        System.out.print("Please enter your birth date(e.g. yymmdd) ");
        Integer birthDate = s.nextInt();
        s.nextLine();

        // Part 1
        Character char1 = Character.toUpperCase(surname.charAt(0));

        Integer n1 = rand.nextInt(899) + 100; // 100 - 999
        Integer n2 = rand.nextInt(10); // 0 - 9
        String p1 = n2.toString() + n1.toString();

        // Part 2
        Integer n3 = rand.nextInt(899) + 100; // 100 - 999
        Integer n4 = rand.nextInt(10); // 0 - 9
        Integer birthday1 = (birthDate / 100000); // first digit of the birthday

        String p2 = n4.toString() + n3.toString() + birthday1;

        // Part 3
        String birthdayLast5 = birthDate.toString().substring(0);

        // Final
        System.out.printf("%c%s-%s-%s\n", char1, p1, p2, birthdayLast5);

        s.close();
    }
}
