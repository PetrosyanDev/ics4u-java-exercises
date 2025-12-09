/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePrep3 {

    public static void main(String[] args) {
        System.out.println("FilePrep2 (Reading) - 12/08/2025");

        File f = new File("myfile.txt");

        StringBuilder builder = new StringBuilder();

        try (Scanner s = new Scanner(f)) {

            while (s.hasNextLine()) {
                builder.append(s.nextLine()).append("\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
            return;
        }

        System.out.println("File contents:");
        System.out.println(builder);
    }
}
