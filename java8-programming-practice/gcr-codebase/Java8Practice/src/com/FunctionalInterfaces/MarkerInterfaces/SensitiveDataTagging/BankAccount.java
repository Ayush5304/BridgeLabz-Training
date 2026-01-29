package com.FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

class BankAccount implements Sensitive {

    String accountNumber;
    double balance;

    BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

