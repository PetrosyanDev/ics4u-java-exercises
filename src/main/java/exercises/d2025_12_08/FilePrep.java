/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

import java.io.File;
import java.io.IOException;

public class FilePrep {
    public static void main(String[] args) {
        System.out.println("FilePrep - 12/08/2025");

        File file = new File("myFile.txt");

        if (file.exists()) {
            System.out.println("File exists");
            return;
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("IO EXCEPTION: " + e);
        }

        // Delete file
        // if (file.delete()) {
        // System.out.println("File deleted");
        // }

    }
}
