/*
 * Student: © Erik Petrosyan
 * Date: 12/15/2025
 */

package assignments.d2025_12_15;

class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int calculateAge() {
        int currentYear = 2025;

        return currentYear - year;
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 2018);

        System.out.println("\nBefore setting values:");
        System.out.printf("Make: %s%n", myCar.getMake());
        System.out.printf("Model: %s%n", myCar.getModel());
        System.out.printf("Year: %d%n", myCar.getYear());
        System.out.printf("Age: %d years%n%n", myCar.calculateAge());

        myCar.setMake("Toyota");
        myCar.setModel("Corolla");
        myCar.setYear(2020);

        System.out.println("\nAfter setting new values:");
        System.out.printf("Make: %s%n", myCar.getMake());
        System.out.printf("Model: %s%n", myCar.getModel());
        System.out.printf("Year: %d%n", myCar.getYear());
        System.out.printf("Age: %d years%n", myCar.calculateAge());
    }
}
