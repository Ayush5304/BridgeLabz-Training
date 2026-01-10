package com.Day1.BookShelf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LibraryCatalog {

    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    public void addBook(Book book) {
        String genre = book.getGenre();

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        System.out.println("Book added successfully");
    }

    public void removeBook(int bookId) {
        for (LinkedList<Book> bookList : catalog.values()) {
            for (Book b : bookList) {
                if (b.getBookId() == bookId) {
                    bookList.remove(b);
                    System.out.println("Book removed successfully");
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }

    public void borrowBook(int bookId) {
        for (LinkedList<Book> bookList : catalog.values()) {
            for (Book b : bookList) {
                if (b.getBookId() == bookId) {
                    if (b.isAvailable()) {
                        b.setAvailable(false);
                        System.out.println("Book borrowed successfully");
                    } else {
                        System.out.println("Already borrowed");
                    }
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(int bookId) {
        for (LinkedList<Book> bookList : catalog.values()) {
            for (Book b : bookList) {
                if (b.getBookId() == bookId) {
                    b.setAvailable(true);
                    System.out.println("Book returned successfully");
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }

    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}