package com.Day1;

public class BankTestDetails {

    public static void main(String[] args) {

        BankAccount acc1 = new SavingAccount("SA101", 10000, 5);
        BankAccount acc2 = new CurrentAccounts("CA201", 15000);

        acc1.deposit(2000);
        acc1.displayBalance();

        // Polymorphism + Interface
        InterestBearing ib = (InterestBearing) acc1;
        ib.calculateInterest();

        acc1.displayBalance();
        acc2.displayBalance();
    }
}
