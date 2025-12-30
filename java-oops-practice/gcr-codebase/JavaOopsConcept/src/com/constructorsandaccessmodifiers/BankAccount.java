package com.constructorsandaccessmodifiers;

//Parent class
class BankAccount {
// Public variable
public String accountNumber;

// Protected variable
protected String accountHolder;

// Private variable
private double balance;

// Constructor
public BankAccount(String accountNumber, String accountHolder, double balance) {
   this.accountNumber = accountNumber;
   this.accountHolder = accountHolder;
   this.balance = balance;
}

// Public method to access balance
public double getBalance() {
   return balance;
}

// Public method to modify balance (deposit)
public void deposit(double amount) {
   if (amount > 0) {
       balance += amount;
   }
}

// Public method to modify balance (withdraw)
public void withdraw(double amount) {
   if (amount > 0 && amount <= balance) {
       balance -= amount;
   } else {
       System.out.println("Insufficient balance or invalid amount.");
   }
}
}

//Subclass demonstrating access to public and protected members
class SavingsAccount extends BankAccount {

private double interestRate;

// Constructor
public SavingsAccount(String accountNumber, String accountHolder,
                     double balance, double interestRate) {
   super(accountNumber, accountHolder, balance);
   this.interestRate = interestRate;
}

// Method using public and protected members
public void displayAccountDetails() {
   System.out.println("Account Number : " + accountNumber);   // public
   System.out.println("Account Holder : " + accountHolder);   // protected
   System.out.println("Balance        : ₹" + getBalance());   // private via getter
   System.out.println("Interest Rate  : " + interestRate + "%");
}
}
