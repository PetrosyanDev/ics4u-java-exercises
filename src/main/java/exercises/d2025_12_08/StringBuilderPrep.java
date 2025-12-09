/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

public class StringBuilderPrep {
    public static void main(String[] args) {
        System.out.println("Exercise02 - 12/08/2025");

        StringBuilder a = new StringBuilder("start");

        a.append(0.1);
        a.append(1);
        a.append(true);
        a.append('a');

        System.out.println(a);

        a.insert(1, "hiiii");

        System.out.println("inserted: " + a);

        a.delete(1, 6);
        a.deleteCharAt(10);

        System.out.println("deleted: " + a);

        a.reverse();

        System.out.println(a);

        String s = a.toString();

    }
}
