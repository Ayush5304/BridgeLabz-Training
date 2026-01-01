package com.Day1;

public class Customer {

    String name;
    Account account;

    Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    void showDetails() {
        System.out.println("Customer Name: " + name);
        account.displayBalance();
    }
}
