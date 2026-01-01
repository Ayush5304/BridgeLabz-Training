package com.encapsulationandpolymorphism.ECommercePlatform;

public class Clothing extends Product implements Discountable {

    private String size;

    public Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double applyDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() - applyDiscount();
    }
}
