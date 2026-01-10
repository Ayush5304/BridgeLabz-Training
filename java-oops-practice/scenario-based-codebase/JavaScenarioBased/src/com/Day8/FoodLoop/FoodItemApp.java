package com.Day8.FoodLoop;

public class FoodItemApp {
    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 300, 5);
        FoodItem burger = new NonVeg("Chicken Burger", 250, 3);
        FoodItem fries  = new VegItem("French Fries ", 150, 10);

        Order order = new Order(paneer, burger, fries);

        order.placeOrder();
    }
}
