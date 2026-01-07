package com.Day6.BookBazaar;

abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock; 

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }
}
