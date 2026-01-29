package com.LambdaExpressions.CustomSortinginECommerce;
class Product {
    int id;
    String name;
    double price;
    double rating;
    double discount;

    public Product(int id, String name, double price,
                   double rating, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%-10s ₹%-8.2f ⭐%.1f 🔥%.0f%%",
                name, price, rating, discount);
    }
}
