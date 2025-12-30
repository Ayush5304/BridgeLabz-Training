package com.constructorsandaccessmodifiers;

public class Person {

    // Instance variables
    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    // Main method for testing
    public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Ayush", 21);

        // Cloned object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.displayDetails();

        System.out.println("\nCopied Person:");
        p2.displayDetails();
    }
}