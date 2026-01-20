package com.Day8.MovieTime;

import java.util.Scanner;

class MovieTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of shows:");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        System.out.println("Enter showtimes (in minutes):");
        for (int i = 0; i < n; i++) {
            showTimes[i] = sc.nextInt();
        }

        ShowScheduler.insertionSort(showTimes);

        System.out.println("Sorted Showtimes:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }
}
