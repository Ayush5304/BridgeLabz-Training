package com.encapsulationandpolymorphism.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private double loanAmount;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 2 / 100; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
        System.out.println("Loan applied for ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= loanAmount;
    }
}

