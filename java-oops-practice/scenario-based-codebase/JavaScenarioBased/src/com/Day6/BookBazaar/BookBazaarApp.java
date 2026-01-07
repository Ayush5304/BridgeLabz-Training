package com.Day6.BookBazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        Book ebook = new EBook("Java Fundamentals","James Gosling",500,10);

        Order order = new Order("Ayush", ebook, 2);

        double finalAmount = order.calculateTotalCost();

        if (finalAmount > 0) {
            System.out.println("Order Confirmed");
            System.out.println("Final Amount: ₹" + finalAmount);
            System.out.println("Order Status: " + order.getStatus());
        }
    }
}
