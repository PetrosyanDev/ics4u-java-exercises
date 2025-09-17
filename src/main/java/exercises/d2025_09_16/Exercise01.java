/*
 * Student: © Erik Petrosyan
 * Date: 09/16/2025
 */

package exercises.d2025_09_16;

public class Exercise01 {
    public static void main(String[] args) {

        String name = "Erik";
        String name_header = "Name:";
        int grade = 11;
        String grade_header = "Grade:";
        String student_number = "963-113-583";
        String student_number_header = "Student #:";
        String birthday = "Jan 15, 1933";
        String birthday_header = "Birthday:";
        int half_line_length = 14;

        System.out.println("*".repeat(half_line_length * 2));
        System.out.printf("%-" + half_line_length + "s%" + half_line_length + "s%n", name_header, name);
        System.out.printf("%-" + half_line_length + "s%" + half_line_length + "s%n", grade_header, grade);
        System.out.printf("%-" + half_line_length + "s%" + half_line_length + "s%n", student_number_header,
                student_number);
        System.out.printf("%-" + half_line_length + "s%" + half_line_length + "s%n", birthday_header, birthday);
        System.out.println("*".repeat(half_line_length * 2));

    }
}
