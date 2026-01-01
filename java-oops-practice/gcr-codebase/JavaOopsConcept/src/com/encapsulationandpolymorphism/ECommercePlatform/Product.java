package com.encapsulationandpolymorphism.ECommercePlatform;

public abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract behavior
    public abstract double calculateFinalPrice();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + productId);
        System.out.println("Product: " + name);
        System.out.println("Final Price: ₹" + calculateFinalPrice());
    }
}
