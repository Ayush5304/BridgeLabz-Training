package com.Day10.PayXpress;
import java.time.LocalDate;

abstract class Bill implements IPayable {

    private String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public Bill(String type, double amount, int daysFromNow) {
        this(type, amount, LocalDate.now().plusDays(daysFromNow));
    }

    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    @Override
    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println(type + " bill is already paid.");
        }
    }

    protected boolean isPaid() {
        return isPaid;
    }

    protected String getType() {
        return type;
    }
}
