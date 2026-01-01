package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

    private List<FoodItem> orderItems = new ArrayList<>();

    public void addItem(FoodItem item) {
        orderItems.add(item);
    }

    public void processOrder() {
        double grandTotal = 0;

        System.out.println("🧾 Order Summary");

        for (FoodItem item : orderItems) {
            item.getItemDetails();

            Discountable d = (Discountable) item;
            System.out.println(d.getDiscountDetails());

            grandTotal += item.calculateTotalPrice();
            System.out.println("");
        }

        System.out.println("Grand Total: ₹" + grandTotal);
    }
}
