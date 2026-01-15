package com.Day4.SmartShelf;

public class SmartShelf {

    public static void sortBooksByTitle(Book[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].getTitle()
                    .compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void displayBooks(Book[] books) {
        for (Book b : books) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() );
        }
    }
}
