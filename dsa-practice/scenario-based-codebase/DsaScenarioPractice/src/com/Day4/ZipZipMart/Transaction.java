package com.Day4.ZipZipMart;

public class Transaction {
    private String date;     
    private double amount;
    private String branch;

    public Transaction(String date, double amount, String branch) {
        this.date = date;
        this.amount = amount;
        this.branch = branch;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getBranch() {
        return branch;
    }
}
