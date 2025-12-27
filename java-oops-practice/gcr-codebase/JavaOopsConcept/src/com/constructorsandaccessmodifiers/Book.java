package com.constructorsandaccessmodifiers;

	public class Book {

	    // Instance variables
	    private String title;
	    private String author;
	    private double price;

	    // 1️⃣ Default Constructor
	    public Book() {
	        this.title = "Unknown";
	        this.author = "Unknown";
	        this.price = 0.0;
	    }

	    // 2️⃣ Parameterized Constructor
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("Price  : " + price);
	    }

	    // Main method for testing
	    public static void main(String[] args) {

	        // Using default constructor
	        Book book1 = new Book();
	        book1.displayBookDetails();

	        System.out.println();

	        // Using parameterized constructor
	        Book book2 = new Book("Java Programming", "James Gosling", 499.99);
	        book2.displayBookDetails();
	    }
	}


