package com.Day1;


public class BankAccount {

    private String accountNumber;  
    protected double balance;        

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

