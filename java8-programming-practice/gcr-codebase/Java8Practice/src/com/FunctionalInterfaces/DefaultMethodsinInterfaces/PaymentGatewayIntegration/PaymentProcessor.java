package com.FunctionalInterfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;

interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}
