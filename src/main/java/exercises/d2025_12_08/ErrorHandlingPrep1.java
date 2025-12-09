/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

public class ErrorHandlingPrep1 {
  public static void main(String[] args) {
    System.out.println("Error handling Prep");

    try {
      sate();
    } catch (RuntimeException e) {
      System.out.println("Caught RuntimeExeception");
    }

  }

  private static void sate() throws RuntimeException {
    throw new RuntimeException("as");
  }
}
