package com.Day10.PayXpress;
class InternetBill extends Bill {

    public InternetBill(double amount, int recurringDays) {
        super("Internet", amount, recurringDays);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("🌐 Internet Bill Reminder: Avoid service disruption!");
        }
    }
}
