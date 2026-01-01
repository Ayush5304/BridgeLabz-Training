package com.Day1;

public class OrderTest {

    public static void main(String[] args) {

        User user = new User("Alice");

        Product p1 = new Product("Book", 500);
        Product p2 = new Product("Pen", 50);

        user.order.addProduct(p1);
        user.order.addProduct(p2);

        user.placeOrder();
    }
}
