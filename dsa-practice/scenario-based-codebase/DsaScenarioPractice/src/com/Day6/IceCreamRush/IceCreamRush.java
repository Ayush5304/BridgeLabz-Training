package com.Day6.IceCreamRush;

import java.util.ArrayList;

public class IceCreamRush {

    public static void bubbleSort(ArrayList<IceCream> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j).sales > list.get(j + 1).sales) {

                    IceCream temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<IceCream> flavors = new ArrayList<>();

        flavors.add(new IceCream("Vanilla", 45));
        flavors.add(new IceCream("Chocolate", 60));
        flavors.add(new IceCream("Strawberry", 30));
        flavors.add(new IceCream("Butterscotch", 55));
        flavors.add(new IceCream("Mango", 25));
        flavors.add(new IceCream("Pista", 40));
        flavors.add(new IceCream("Kesar", 35));
        flavors.add(new IceCream("Black Currant", 50));

        System.out.println("Before Sorting:");
        System.out.println(flavors);

        bubbleSort(flavors);

        System.out.println("\nAfter Sorting (by popularity):");
        System.out.println(flavors);
    }
}
