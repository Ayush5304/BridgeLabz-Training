package com.Day10.PayXpress;
import java.time.LocalDate; 
public class PayXpressApp {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200, LocalDate.now().plusDays(5));
        Bill internet = new InternetBill(899, 30);
        Bill water = new WaterBill(450, LocalDate.now().plusDays(7));

        Bill[] bills = { electricity, internet, water };

        for (Bill bill : bills) {
            bill.sendReminder();   
            bill.pay();
            System.out.println("Late Fee (if any): ₹" + bill.calculateLateFee(100));
            System.out.println("");
        }
    }
}
