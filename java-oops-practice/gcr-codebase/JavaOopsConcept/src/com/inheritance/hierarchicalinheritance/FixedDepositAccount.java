package com.inheritance.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {

    int tenureYears;

    FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Tenure: " + tenureYears + " years");
    }
}
