package com.Day6.BookBazaar;

class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.10; 
    }
}
