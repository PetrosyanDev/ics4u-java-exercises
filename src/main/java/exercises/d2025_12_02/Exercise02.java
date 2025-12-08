/*
 * Student: © Erik Petrosyan
 * Date: 12/02/2025
 */

package exercises.d2025_12_02;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Exercise02 - 12/02/2025");
        System.out.println("\n=== Task 2: Class Implementation ===");

        // Question 1: The Dog Class
        System.out.println("\nQuestion 1: The Dog Class");
        Dog dog1 = new Dog(); // Default constructor
        Dog dog2 = new Dog("Buddy", 3, "Golden Retriever"); // Parameterized constructor

        // Question 2: The Rectangle Class
        System.out.println("\nQuestion 2: The Rectangle Class");
        Rectangle rect1 = new Rectangle(); // Default constructor
        Rectangle rect2 = new Rectangle(5.5, 3.2); // Parameterized constructor

        // Question 3: The Product Class
        System.out.println("\nQuestion 3: The Product Class");
        Product prod1 = new Product(); // Default constructor
        Product prod2 = new Product(1001, "Laptop", 999.99); // Parameterized constructor

        // Question 4: The Airplane Class
        System.out.println("\nQuestion 4: The Airplane Class");
        Airplane plane1 = new Airplane(); // Default constructor
        Airplane plane2 = new Airplane("Delta", "DL123", 180); // Parameterized constructor

        // Question 5: The Coffee Class
        System.out.println("\nQuestion 5: The Coffee Class");
        Coffee coffee1 = new Coffee(); // Default constructor
        Coffee coffee2 = new Coffee("Latte", "Medium", true); // Parameterized constructor

        System.out.println("\nAll objects created successfully!");
    }
}

// Question 1: The Dog Class
class Dog {
    private String name;
    private int age;
    private String breed;

    // Default constructor
    public Dog() {
        this.name = "";
        this.age = 0;
        this.breed = "";
    }

    // Parameterized constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}

// Question 2: The Rectangle Class
class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// Question 3: The Product Class
class Product {
    private int productID;
    private String productName;
    private double price;

    // Default constructor
    public Product() {
        this.productID = 0;
        this.productName = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
}

// Question 4: The Airplane Class
class Airplane {
    private String airline;
    private String flightNumber;
    private int numberOfPassengers;

    // Default constructor
    public Airplane() {
        this.airline = "";
        this.flightNumber = "";
        this.numberOfPassengers = 0;
    }

    // Parameterized constructor
    public Airplane(String airline, String flightNumber, int numberOfPassengers) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.numberOfPassengers = numberOfPassengers;
    }
}

// Question 5: The Coffee Class
class Coffee {
    private String type;
    private String size;
    private boolean hasMilk;

    // Default constructor
    public Coffee() {
        this.type = "";
        this.size = "";
        this.hasMilk = false;
    }

    // Parameterized constructor
    public Coffee(String type, String size, boolean hasMilk) {
        this.type = type;
        this.size = size;
        this.hasMilk = hasMilk;
    }
}
