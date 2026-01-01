package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double base = (getPrice() * getQuantity()) + NON_VEG_CHARGE;
        return base - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05; 
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5% + Extra Charge ₹50";
    }
}
