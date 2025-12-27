package com.constructorsandaccessmodifiers;

//Parent class
class Bookthird {

 // Public variable
 public String ISBN;

 // Protected variable
 protected String title;

 // Private variable
 private String author;

 // Constructor
 public Bookthird(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Public getter for author
 public String getAuthor() {
     return author;
 }

 // Public setter for author
 public void setAuthor(String author) {
     this.author = author;
 }
}

//Subclass demonstrating access modifiers
class EBook extends Bookthird {

 private double fileSize; // in MB

 // Constructor
 public EBook(String ISBN, String title, String author, double fileSize) {
     super(ISBN, title, author);
     this.fileSize = fileSize;
 }

 // Method accessing public and protected members
 public void displayEBookDetails() {
     System.out.println("ISBN      : " + ISBN);         // public
     System.out.println("Title     : " + title);        // protected
     System.out.println("Author    : " + getAuthor());  // private via getter
     System.out.println("File Size : " + fileSize + " MB");
 }
}


