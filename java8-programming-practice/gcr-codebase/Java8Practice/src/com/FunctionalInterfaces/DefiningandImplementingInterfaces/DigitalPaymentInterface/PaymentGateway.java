package com.FunctionalInterfaces.DefiningandImplementingInterfaces.DigitalPaymentInterface;

public class PaymentGateway {
    public static void main(String[] args) {

        Payment payment;

        payment = new UPI();
        payment.pay(1200);

        payment = new CreditCard();
        payment.pay(2500);

        payment = new Wallet();
        payment.pay(500);
    }
}
