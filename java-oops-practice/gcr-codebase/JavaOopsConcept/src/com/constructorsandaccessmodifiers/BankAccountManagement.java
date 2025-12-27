package com.constructorsandaccessmodifiers;

//Main class
public class BankAccountManagement {

 public static void main(String[] args) {

     SavingsAccount account =
             new SavingsAccount("SB1001", "Ayush Mishra", 5000.0, 4.5);

     account.displayAccountDetails();

     System.out.println("\nDepositing ₹2000...\n");
     account.deposit(2000);

     account.displayAccountDetails();

     System.out.println("\nWithdrawing ₹3000...\n");
     account.withdraw(3000);

     account.displayAccountDetails();
 }
}