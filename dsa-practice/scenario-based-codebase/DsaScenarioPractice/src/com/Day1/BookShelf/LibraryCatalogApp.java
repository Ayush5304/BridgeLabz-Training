package com.Day1.BookShelf;


	public class LibraryCatalogApp {
	    public static void main(String[] args) {

	        LibraryCatalog library = new LibraryCatalog();

	        Book b1 = new Book(1, "Clean Code", "Robert Martin", "Programming");
	        Book b2 = new Book(2, "Effective Java", "Joshua Bloch", "Programming");
	        Book b3 = new Book(3, "Harry Potter", "J.K. Rowling", "Fantasy");

	        library.addBook(b1);
	        library.addBook(b2);
	        library.addBook(b3);

	        library.displayCatalog();

	        library.borrowBook(2);
	        library.borrowBook(2);

	        library.returnBook(2);

	        library.removeBook(1);

	        library.displayCatalog();
	    }
	}