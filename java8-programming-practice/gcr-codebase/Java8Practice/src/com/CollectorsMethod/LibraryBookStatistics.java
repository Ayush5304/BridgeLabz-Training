package com.CollectorsMethod;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {

    static class Book {
        String title;
        String genre;
        int pages;

        public Book(String title, String genre, int pages) {
            this.title = title;
            this.genre = genre;
            this.pages = pages;
        }

        public String getGenre() {
            return genre;
        }

        public int getPages() {
            return pages;
        }
    }

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("The Alchemist", "Fiction", 200),
                new Book("Atomic Habits", "Self-Help", 280),
                new Book("Harry Potter", "Fiction", 500),
                new Book("Deep Work", "Self-Help", 300),
                new Book("Clean Code", "Programming", 450),
                new Book("Java Complete Ref", "Programming", 650)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream().collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)));

        System.out.println(" Book Statistics By Genre:\n");

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages   → " + stats.getSum());
            System.out.println("Average Pages → " + stats.getAverage());
            System.out.println("Maximum Pages → " + stats.getMax());
            System.out.println("");
        });
    }
}
