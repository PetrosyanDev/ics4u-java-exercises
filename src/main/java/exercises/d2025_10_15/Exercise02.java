/*
 * Student: © Erik Petrosyan
 * Date: 10/15/2025
 */

package exercises.d2025_10_15;

public class Exercise02 {
    public static void main(String[] args) {
        String day = "Monday";
        String dayType;

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
                || "Thursday".equals(day) || "Friday".equals(day)) {
            dayType = "Weekday";
        } else if ("Saturday".equals(day) || "Sunday".equals(day)) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid day";
        }

        System.out.println(day + " is a " + dayType);
    }
}
