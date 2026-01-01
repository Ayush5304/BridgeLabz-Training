package com.encapsulationandpolymorphism.ECommercePlatform;

public class Electronics extends Product implements Discountable {

    private int warrantyYears;

    public Electronics(int id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double applyDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() - applyDiscount();
    }
}
