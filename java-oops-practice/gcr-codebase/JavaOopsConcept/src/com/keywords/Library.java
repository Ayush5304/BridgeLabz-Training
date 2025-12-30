package com.keywords;

public class Library {

    public static void main(String[] args) {

        // Set the library name (static variable)
        BookNew.setLibraryName("Egmore Library");

        // Display the library name
        BookNew.displayLibraryName();

        // Create a new book instance
        BookNew book1 = new BookNew(
                "Effective Java",
                "Joshua Bloch",
                "978-0134685991"
        );

        // Display book details
        book1.displayBookDetails();
    }
}