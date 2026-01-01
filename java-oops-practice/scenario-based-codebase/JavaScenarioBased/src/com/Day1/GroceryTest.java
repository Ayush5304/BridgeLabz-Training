package com.Day1;

public class GroceryTest {

    public static void main(String[] args) {

        // Fixed-size array (example use)
        double[] priceList = {3.0, 2.0};

        Item apples = new Item("Apples", priceList[0]);
        Item milk = new Item("Milk", priceList[1]);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(apples, 2);
        cart.addItem(milk, 1);

        System.out.println(cart.generateBill());
    }
}
