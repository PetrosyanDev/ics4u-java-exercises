/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrep1 {
    public static void main(String[] args) {
        System.out.println("FilePrep1 (Writing) - 12/08/2025");

        try (FileWriter writer = new FileWriter("myFile.txt")) {
            writer.write("Hello!");
        } catch (IOException e) {
            System.out.println("IOEXCEPTION: " + e);
        }

        // Delete file
        // if (file.delete()) {
        // System.out.println("File deleted");
        // }

    }
}
