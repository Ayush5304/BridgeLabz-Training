package com.Day3.MyBank;
interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
