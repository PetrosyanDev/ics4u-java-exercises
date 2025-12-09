/*
 * Student: © Erik Petrosyan
 * Date: 12/08/2025
 */

package exercises.d2025_12_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPrep {
    public static void main(String[] args) {
        System.out.println("Exercise01 - 12/08/2025");

        ArrayList<Integer> a = new ArrayList<>();

        System.out.println("Size: " + a.size());

        for (int i = 0; i < 20; i++) {
            a.add(i);
        }

        System.out.println(a.get(0));

        a.remove(0);

        a.set(0, 99);

        a.remove(6);

        System.out.println(a);

        Collections.sort(a, Collections.reverseOrder());

        Iterator<Integer> ait = a.iterator();

        while (ait.hasNext()) {
            Integer delVal = ait.next();

            System.out.println("Deleting " + delVal);
        }

        System.out.println(a);

        a.clear();

    }
}
