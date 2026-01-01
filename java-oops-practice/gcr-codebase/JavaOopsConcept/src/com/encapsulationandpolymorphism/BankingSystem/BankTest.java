package com.encapsulationandpolymorphism.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class BankTest {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 =
                new SavingsAccount("SA101", "Rahul", 50000, 4.5);
        BankAccount a2 =
                new CurrentAccount("CA201", "Amit", 80000);

        accounts.add(a1);
        accounts.add(a2);

        for (BankAccount acc : accounts) {

            acc.displayDetails();

            double interest = acc.calculateInterest();
            System.out.println("Interest: ₹" + interest);

            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan(20000);

            System.out.println("Loan Eligible: " +
                    loanAcc.calculateLoanEligibility());

            System.out.println("");
        }
    }
}
