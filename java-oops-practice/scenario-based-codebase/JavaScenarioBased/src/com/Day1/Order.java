package com.Day1;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    void displayOrder() {
        System.out.println("Order Details:");
        for (Product p : products) {
            System.out.println(p.name + " - ₹" + p.price);
        }
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}
