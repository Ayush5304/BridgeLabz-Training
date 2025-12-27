package com.constructorsandaccessmodifiers;

//Main class
public class BookLibrarySystem {

 public static void main(String[] args) {

     EBook ebook = new EBook(
             "978-0135166307",
             "Core Java Programming",
             "James Gosling",
             4.8
     );

     ebook.displayEBookDetails();

     System.out.println("\nUpdating Author Name...\n");

     // Modifying private variable using setter
     ebook.setAuthor("Oracle Java Team");

     ebook.displayEBookDetails();
 }
}