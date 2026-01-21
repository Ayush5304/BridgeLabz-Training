package com.Day9.ECommerceProductInventory;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EcommerceInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Product> inventory = new TreeMap<>();

        while (true) {

            System.out.println("\n E-Commerce Product Inventory ");
            System.out.println("1. Add Product");
            System.out.println("2. Lookup Product by SKU");
            System.out.println("3. Update Product Price");
            System.out.println("4. Display Products (Sorted by SKU)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.put(sku, new Product(sku, name, price));
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter SKU to search: ");
                    int searchSku = sc.nextInt();

                    if (inventory.containsKey(searchSku)) {
                        Product p = inventory.get(searchSku);
                        System.out.println("Product Found → SKU: " + p.sku +
                                ", Name: " + p.name + ", Price: ₹" + p.price);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter SKU to update price: ");
                    int updateSku = sc.nextInt();

                    if (inventory.containsKey(updateSku)) {
                        System.out.print("Enter new price: ");
                        double newPrice = sc.nextDouble();
                        inventory.get(updateSku).price = newPrice;
                        System.out.println("Price updated successfully.");
                    } else {
                        System.out.println("Invalid SKU.");
                    }
                    break;

                case 4:
                    System.out.println("\nProducts Sorted by SKU:");
                    for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
                        Product p = entry.getValue();
                        System.out.println("SKU: " + p.sku +
                                ", Name: " + p.name +
                                ", Price: ₹" + p.price);
                    }
                    break;

                case 5:
                    System.out.println("Exiting inventory system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
