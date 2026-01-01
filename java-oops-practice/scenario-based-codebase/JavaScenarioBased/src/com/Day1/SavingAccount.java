package com.Day1;

public class SavingAccount extends BankAccount implements InterestBearing {

    private double interestRate;

    public SavingAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: ₹" + interest);
    }
}
