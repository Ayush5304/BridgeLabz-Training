package com.Day4.SwiftCart;

class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    double getDiscountedPrice() {
        return price * 0.95;
    }
}
