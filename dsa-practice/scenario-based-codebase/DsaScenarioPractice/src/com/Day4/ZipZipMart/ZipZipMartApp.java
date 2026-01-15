package com.Day4.ZipZipMart;

public class ZipZipMartApp {
    public static void main(String[] args) {

        Transaction[] transactions = {
            new Transaction("2026-01-10", 2500, "Bhopal"),
            new Transaction("2026-01-08", 1500, "Indore"),
            new Transaction("2026-01-10", 1800, "Delhi"),
            new Transaction("2026-01-05", 3000, "Mumbai"),
            new Transaction("2026-01-08", 1200, "Pune")
        };

        System.out.println("Before Sorting:");
        ZipZipMartReport.display(transactions);

        ZipZipMartReport.mergeSort(transactions, 0, transactions.length - 1);

        System.out.println("\nAfter Sorting (Date → Amount):");
        ZipZipMartReport.display(transactions);
    }
}
