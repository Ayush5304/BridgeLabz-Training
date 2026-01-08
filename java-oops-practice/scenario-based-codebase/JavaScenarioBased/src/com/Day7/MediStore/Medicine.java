package com.Day7.MediStore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); 
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    @Override
    public void sell(int qty) {
        if (qty <= quantity && !checkExpiry()) {
            quantity -= qty;
            double total = calculateTotal(qty);
            System.out.println(qty + " " + name + " sold. Total Price: ₹" + total);
        } else {
            System.out.println("Cannot sell medicine (Out of stock / Expired)");
        }
    }

    private double calculateTotal(int qty) {
        double total = qty * price;
        return applyDiscount(total);
    }

    private double applyDiscount(double amount) {
        return amount > 500 ? amount * 0.9 : amount; // 10% discount
    }

    protected LocalDate getExpiryDate() {
        return expiryDate;
    }

    protected String getName() {
        return name;
    }
}
