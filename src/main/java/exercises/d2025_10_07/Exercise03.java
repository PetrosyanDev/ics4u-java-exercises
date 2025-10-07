/*
 * Student: © Erik Petrosyan
 * Date: 10/07/2025
 */

package exercises.d2025_10_07;

public class Exercise03 {
    static final String storedUsername = "ics4u";
    static final String storedPassword = "password";

    public static void main(String[] args) {
        System.out.println("Exercise03 - 10/07/2025");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (storedUsername == enteredUsername) {
            if (storedPassword == enteredPassword) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("User not found.");
        }

        scanner.close();
    }
}
