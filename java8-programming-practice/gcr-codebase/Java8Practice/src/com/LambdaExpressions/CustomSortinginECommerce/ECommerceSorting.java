package com.LambdaExpressions.CustomSortinginECommerce;

import java.util.*;

public class ECommerceSorting {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(101, "iPhone", 79999, 4.8, 10),
                new Product(102, "Samsung", 65999, 4.6, 15),
                new Product(103, "OnePlus", 54999, 4.5, 20),
                new Product(104, "Pixel", 72999, 4.7, 12)
        );

        List<Product> list = new ArrayList<>(products);

        System.out.println("Original Products:\n");
        list.forEach(System.out::println);

        list.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:");
        list.forEach(System.out::println);

        list.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        list.forEach(System.out::println);

        list.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        list.forEach(System.out::println);
    }
}

