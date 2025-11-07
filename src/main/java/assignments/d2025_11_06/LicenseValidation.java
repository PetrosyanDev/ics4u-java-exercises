/*
 * Students: © Amatul Noor, Erik Petrosyan
 * Date: 11/06/2025
 * 
 * Surname: P-
 * Birthdate: 080715
 * Check: P3754-64720-80715
 */

package assignments.d2025_11_06;

import java.util.Random;
import java.util.Scanner;

public class LicenseValidation {
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
        String birthDate = s.nextLine();

        System.out.printf("%n%s%n", "-".repeat(20));
        System.out.print("Please enter your driver's license number: ");
        String license = s.nextLine();

        // Check initials
        Character char1 = Character.toUpperCase(surname.charAt(0));
        Character licensechar1 = Character.toUpperCase(license.charAt(0));

        // Check Birthdate1
        Character char10 = birthDate.charAt(0);
        Character licensechar10 = license.charAt(10);

        // Check BirthdateLast5
        String birthdayLast5 = birthDate.substring(birthDate.length() - 5);
        String licenseLast5 = license.substring(license.length() - 5);

        // Final Check
        if (!(char1.equals(licensechar1) && char10.equals(licensechar10) && birthdayLast5.equals(licenseLast5))) {
            System.out.printf("%b %b %b", char1.equals(licensechar1), char10.equals(licensechar10),
                    birthdayLast5.equals(licenseLast5));
            System.out.println("Your driver's license number is INVALID!");
            return;
        } else {
            System.out.println("Your driver's license number is VALID!");
        }

        s.close();
    }
}
