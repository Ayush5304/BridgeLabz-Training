package com.Day1;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {

    // Dynamic collection of items
    ArrayList<Item> items = new ArrayList<>();

    // Quantity tracking (key-value)
    HashMap<String, Integer> quantityMap = new HashMap<>();

    void addItem(Item item, int quantity) {
        items.add(item);
        quantityMap.put(item.name,
                quantityMap.getOrDefault(item.name, 0) + quantity);
    }

    double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            int qty = quantityMap.get(item.name);
            total += item.pricePerUnit * qty;
        }
        return total;
    }

    String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("🧾 Grocery Bill\n");

        for (Item item : items) {
            int qty = quantityMap.get(item.name);
            bill.append(item.name)
                .append(" x ")
                .append(qty)
                .append(" = ₹")
                .append(item.pricePerUnit * qty)
                .append("\n");
        }

        bill.append("Total: ₹").append(calculateTotal());
        return bill.toString();
    }
}
