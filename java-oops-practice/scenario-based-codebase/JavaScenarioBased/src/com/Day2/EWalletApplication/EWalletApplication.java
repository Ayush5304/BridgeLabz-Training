package com.Day2.EWalletApplication;

public class EWalletApplication {

    public static void main(String[] args) {

        Wallet personalWallet = new PersonalWallet(5000, 500);
        Wallet businessWallet = new BusinessWallet(20000);

        User user1 = new User("Ayush", personalWallet);
        User user2 = new User("Rohit", businessWallet);

        System.out.println("Initial Balances:");
        System.out.println("Ayush: ₹" + user1.getWallet().getBalance());
        System.out.println("Rohit: ₹" + user2.getWallet().getBalance());

        System.out.println("\nTransfers");
        user1.getWallet().transferTo(user2, 2000);
        user2.getWallet().transferTo(user1, 3000);

        System.out.println("\nFinal Balances:");
        System.out.println("Ayush: ₹" + user1.getWallet().getBalance());
        System.out.println("Rohit: ₹" + user2.getWallet().getBalance());
    }
}
