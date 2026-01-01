package com.encapsulationandpolymorphism.BankingSystem;
public class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate;
    private double loanAmount;

    public SavingsAccount(String accNo, String name, double balance, double interestRate) {
        super(accNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
        System.out.println("Loan applied for ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= loanAmount / 2;
    }
}
