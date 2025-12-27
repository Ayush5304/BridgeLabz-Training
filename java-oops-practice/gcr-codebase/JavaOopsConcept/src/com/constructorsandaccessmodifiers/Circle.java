package com.constructorsandaccessmodifiers;

public class Circle {

    // Instance variable
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0);   // Constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius of the circle: " + radius);
    }

    // Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();
        c1.displayRadius();

        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.displayRadius();
    }
}
