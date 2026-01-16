package com.Day5.RoboWarehouse;

public class InsertionSortUtil {

    public static void insertInSortedShelf(PackageItem[] shelf, int n, PackageItem newItem) {

        int i = n - 1;

        while (i >= 0 && shelf[i].getWeight() > newItem.getWeight()) {
            shelf[i + 1] = shelf[i];
            i--;
        }

        shelf[i + 1] = newItem;
    }
}
