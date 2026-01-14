package com.Day10.PayXpress;
import java.time.LocalDate; 
class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("💧 Water Bill Reminder: Please pay to avoid penalty.");
        }
    }
}
