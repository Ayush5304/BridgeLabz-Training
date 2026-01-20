package com.Day8.FoodFest;

import java.util.Scanner;

class FoodFest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of zones:");
        int z = sc.nextInt();

        int[][] zones = new int[z][];

        for (int i = 0; i < z; i++) {
            System.out.println("Enter number of stalls in Zone " + (i + 1) + ":");
            int n = sc.nextInt();

            zones[i] = new int[n];

            System.out.println("Enter sorted footfall data for Zone " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                zones[i][j] = sc.nextInt();
            }
        }

        int[] masterList = FestivalMerger.mergeAllZones(zones);

        System.out.println("Master Footfall List:");
        for (int x : masterList) {
            System.out.print(x + " ");
        }
    }
}
