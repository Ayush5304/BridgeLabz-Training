package com.FunctionalInterfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;

public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor p1 = new UPIProcessor();
        p1.pay(1000);
        p1.refund(200);

        PaymentProcessor p2 = new CardProcessor();
        p2.pay(2500);
        p2.refund(500);
    }
}
