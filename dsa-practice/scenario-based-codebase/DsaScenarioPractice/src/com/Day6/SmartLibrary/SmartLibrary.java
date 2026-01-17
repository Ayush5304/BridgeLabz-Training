package com.Day6.SmartLibrary;

import java.util.ArrayList;

public class SmartLibrary {

    public static void insertBook(ArrayList<Book> list, Book newBook) {

        list.add(newBook);  
        int i = list.size() - 1;

        while (i > 0 &&
                list.get(i - 1).title.compareToIgnoreCase(list.get(i).title) > 0) {

            Book temp = list.get(i);
            list.set(i, list.get(i - 1));
            list.set(i - 1, temp);

            i--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Book> borrowed = new ArrayList<>();

        borrowed.add(new Book("Algorithms"));
        borrowed.add(new Book("Data Structures"));
        borrowed.add(new Book("Operating Systems"));
        borrowed.add(new Book("Python Programming"));

        System.out.println("Before new book issue:");
        System.out.println(borrowed);

        Book newBook = new Book("Computer Networks");
        insertBook(borrowed, newBook);

        System.out.println("\nAfter new book issue:");
        System.out.println(borrowed);
    }
}
