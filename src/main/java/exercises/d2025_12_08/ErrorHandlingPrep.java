/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

public class ErrorHandlingPrep {
  public static void main(String[] args) {
    System.out.println("Error handling Prep");

    try {
      int a = 2 / 0;
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finally");
    }
  }
}
