package com.Day6.BookBazaar;

class Order {

    private String userName;
    private Book book;
    private int quantity;
    private String status; 

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    public double calculateTotalCost() {

        if (!book.reduceStock(quantity)) {
            System.out.println(" Not enough stock available");
            status = "FAILED";
            return 0;
        }

        double totalPrice = book.price * quantity;
        double discount = book.applyDiscount(totalPrice);

        status = "CONFIRMED";
        return totalPrice - discount;
    }

    public String getStatus() {
        return status;
    }
}
