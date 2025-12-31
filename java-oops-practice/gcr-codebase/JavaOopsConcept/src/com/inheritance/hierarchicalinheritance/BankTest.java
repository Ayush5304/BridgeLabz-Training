package com.inheritance.hierarchicalinheritance;

public class BankTest {

    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount a2 = new CheckingAccount("CA201", 30000, 5);
        BankAccount a3 = new FixedDepositAccount("FD301", 100000, 3);

        a1.displayAccountType();
        System.out.println("");
        a2.displayAccountType();
        System.out.println("");
        a3.displayAccountType();
    }
}
