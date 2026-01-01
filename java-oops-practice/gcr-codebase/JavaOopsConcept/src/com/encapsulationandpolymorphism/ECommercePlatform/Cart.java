package com.encapsulationandpolymorphism.ECommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void checkout() {
        System.out.println("🧾 Cart Summary");
        double total = 0;

        for (Product p : products) {
            p.displayDetails();
            total += p.calculateFinalPrice();
            System.out.println("");
        }

        System.out.println("Total Payable Amount: ₹" + total);
    }
}
