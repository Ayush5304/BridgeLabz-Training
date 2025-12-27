package com.constructorsandaccessmodifiers;

public class Booksecond {

    // Instance variables
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor
    public Booksecond(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // book is available initially
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Availability : " +
                (isAvailable ? "Available" : "Not Available"));
    }

    // Main method for testing
    public static void main(String[] args) {

        Booksecond book = new Booksecond(
                "Core Java",
                "James Gosling",
                450.00
        );

        book.displayBookDetails();
        System.out.println();

        book.borrowBook();
        book.displayBookDetails();
        System.out.println();

        // Trying to borrow again
        book.borrowBook();
    }
}


