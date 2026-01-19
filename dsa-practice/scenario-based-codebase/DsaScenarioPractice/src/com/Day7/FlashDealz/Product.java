package com.Day7.FlashDealz;

public class Product {
    int id;
    String name;
    int discount;  

    public Product(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + discount + "%";
    }
}
