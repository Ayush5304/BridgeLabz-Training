package com.Day1.BookShelf;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book(int bookId, String title, String author, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true; // default
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "BookID=" + bookId +
               ", Title=" + title +
               ", Author=" + author +
               ", Genre=" + genre +
               ", Available=" + available;
    }
}
