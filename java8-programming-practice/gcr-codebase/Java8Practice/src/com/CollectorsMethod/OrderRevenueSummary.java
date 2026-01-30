package com.CollectorsMethod;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    static class Order {
        String customer;
        double amount;

        public Order(String customer, double amount) {
            this.customer = customer;
            this.amount = amount;
        }

        public String getCustomer() {
            return customer;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Ayush", 1200),
                new Order("Rohit", 800),
                new Order("Ayush", 500),
                new Order("Neha", 1500),
                new Order("Rohit", 700)
        );

        Map<String, Double> revenueSummary =
                orders.stream().collect(Collectors.groupingBy(
                                Order::getCustomer,
                                Collectors.summingDouble(Order::getAmount) ));

        System.out.println(" Revenue Summary Per Customer:");
        revenueSummary.forEach((customer, total) ->
                System.out.println(customer + " → " + total));
    }
}
