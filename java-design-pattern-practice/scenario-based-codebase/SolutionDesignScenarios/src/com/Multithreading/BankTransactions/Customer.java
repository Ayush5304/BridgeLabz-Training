package com.Multithreading.BankTransactions;
class Customer extends Thread {

    private final Bank bank;
    private final int accountNumber;

    public Customer(String name, Bank bank, int accountNumber) {
        super(name);
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {

        try {
            bank.deposit(accountNumber, 500);
            Thread.sleep(100);

            bank.withdraw(accountNumber, 300);
            Thread.sleep(100);

            bank.withdraw(accountNumber, 700);
            Thread.sleep(100);

            bank.deposit(accountNumber, 200);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
