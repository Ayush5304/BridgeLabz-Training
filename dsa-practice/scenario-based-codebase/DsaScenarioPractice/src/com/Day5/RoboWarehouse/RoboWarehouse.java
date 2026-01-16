package com.Day5.RoboWarehouse;

public class RoboWarehouse {

    public static void main(String[] args) {

        PackageItem[] shelf = new PackageItem[10];

        shelf[0] = new PackageItem(5);
        shelf[1] = new PackageItem(10);
        shelf[2] = new PackageItem(15);
        shelf[3] = new PackageItem(20);
        shelf[4] = new PackageItem(25);

        int currentSize = 5;

        System.out.println("Shelf before adding new package:");
        printShelf(shelf, currentSize);

        PackageItem newPackage = new PackageItem(12);
        System.out.println("\nNew package arrived: " + newPackage);

        InsertionSortUtil.insertInSortedShelf(shelf, currentSize, newPackage);
        currentSize++;

        System.out.println("\nShelf after insertion:");
        printShelf(shelf, currentSize);
    }

    public static void printShelf(PackageItem[] shelf, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(shelf[i] + " ");
        }
        System.out.println();
    }
}
