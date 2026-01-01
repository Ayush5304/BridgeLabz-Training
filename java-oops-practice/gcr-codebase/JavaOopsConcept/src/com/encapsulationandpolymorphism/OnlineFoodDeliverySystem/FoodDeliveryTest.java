package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

public class FoodDeliveryTest {

    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);

        OrderProcessor order = new OrderProcessor();
        order.addItem(f1);
        order.addItem(f2);

        order.processOrder();
    }
}
