package com.inheritance.hierarchicalinheritance;

public class CheckingAccount extends BankAccount {

    int withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
