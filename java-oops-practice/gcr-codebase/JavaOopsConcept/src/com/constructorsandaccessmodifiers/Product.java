package com.constructorsandaccessmodifiers;

public class Product {

    // Instance variables (unique for each product)
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0;

    // Parameterized Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;   // increment when a product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 20000);
        Product p3 = new Product("Headphones", 3000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Calling class method using class name
        Product.displayTotalProducts();
    }
}
