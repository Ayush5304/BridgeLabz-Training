package com.FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

public class EncryptionEngine {

    public static void encrypt(Object obj) {

        if (obj instanceof Sensitive) {
            System.out.println("🔐 Encrypting sensitive data...");
        } else {
            System.out.println("Normal processing...");
        }
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("12345", 50000);
        String name = "Ayush";

        encrypt(acc);
        encrypt(name);
    }
}
