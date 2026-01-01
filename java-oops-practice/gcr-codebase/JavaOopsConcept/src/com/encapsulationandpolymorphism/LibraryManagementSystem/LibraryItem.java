package com.encapsulationandpolymorphism.LibraryManagementSystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    // Encapsulated borrower data
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (Encapsulation)
    public int getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    protected void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + isAvailable);
    }
}
