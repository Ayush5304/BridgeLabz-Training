package com.Multithreading.BankTransactions;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Map<Integer, Integer> data = new HashMap<>();
        data.put(101, 1000);
        data.put(102, 1500);

        Bank bank = new Bank(data);

        Customer c1 = new Customer("Customer-1", bank, 101);
        Customer c2 = new Customer("Customer-2", bank, 101);
        Customer c3 = new Customer("Customer-3", bank, 102);

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();

        System.out.println("\nFinal Balances:");
        System.out.println("Account 101: " + bank.getBalance(101));
        System.out.println("Account 102: " + bank.getBalance(102));
    }
}

