package com.constructorsandaccessmodifiers;

public class Book {

    // Instance variables
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // book is available initially
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, the book is currently not available.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method for testing
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", 499.99);

        book1.displayBookDetails();
        System.out.println();

        // Borrow the book
        book1.borrowBook();
        book1.displayBookDetails();
        System.out.println();

        // Try borrowing again
        book1.borrowBook();
    }
}
