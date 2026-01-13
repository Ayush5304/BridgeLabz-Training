package com.Day3.SmartCheckout;

import java.util.*;

public class SmartCheckoutApp {

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();
        
        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 40, 3);
        checkout.addItem("Eggs", 10, 10);

        Customer c1 = new Customer("Ayush", Arrays.asList("Milk", "Bread", "Eggs"));
        Customer c2 = new Customer("Rohit", Arrays.asList("Milk", "Milk", "Bread"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();
    }
}
