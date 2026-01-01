package com.Day1;

public class BankTest {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(10000, 5);
        Customer customer1 = new Customer("Rahul", savings);

        customer1.showDetails();

        savings.deposit(2000);
        savings.withdraw(3000);
        savings.calculateInterest();

        customer1.showDetails();
    }
}
