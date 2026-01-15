package com.Day4.SmartShelf;

public class SmartShelfApp {
    public static void main(String[] args) {

        Book[] books = {
            new Book("Data Structures", "Mark Allen"),
            new Book("Algorithms", "Robert Sedgewick"),
            new Book("Computer Networks", "Andrew Tanenbaum"),
            new Book("Operating Systems", "Abraham Silberschatz"),
            new Book("Database Systems", "Elmasri")
        };

        System.out.println("Before Sorting:");
        SmartShelf.displayBooks(books);

        SmartShelf.sortBooksByTitle(books);

        System.out.println("\nAfter Sorting by Title (A-Z):");
        SmartShelf.displayBooks(books);
    }
}
