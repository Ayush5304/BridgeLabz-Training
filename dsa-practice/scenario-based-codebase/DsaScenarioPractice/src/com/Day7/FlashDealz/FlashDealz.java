package com.Day7.FlashDealz;

public class FlashDealz {

    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(Product[] arr, int low, int high) {

        int pivot = arr[high].discount;  
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].discount >= pivot) {
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Phone", 20),
                new Product(102, "Laptop", 35),
                new Product(103, "Headphones", 15),
                new Product(104, "Smartwatch", 40),
                new Product(105, "TV", 30)
        };

        quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
