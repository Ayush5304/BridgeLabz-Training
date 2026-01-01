package com.Day1;

public class Account {

    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
