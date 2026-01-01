package com.Day1;

public class User {

    String name;
    Order order;

    User(String name) {
        this.name = name;
        this.order = new Order();
    }

    void placeOrder() {
        System.out.println("Customer: " + name);
        order.displayOrder();
    }
}
