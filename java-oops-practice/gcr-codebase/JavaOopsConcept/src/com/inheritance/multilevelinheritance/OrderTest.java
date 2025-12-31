package com.inheritance.multilevelinheritance;

public class OrderTest {

    public static void main(String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(101, "12-09-2025",
                                   "TRK12345", "15-09-2025");

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Status: " + order.getOrderStatus());
    }
}
