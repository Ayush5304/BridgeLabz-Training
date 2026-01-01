package com.encapsulationandpolymorphism.ECommercePlatform;

public class ECommerceTest {

    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 60000, 2);
        Product p2 = new Clothing(102, "T-Shirt", 1500, "M");

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.checkout();
    }
}
