package com.Day8.GamerZone;

import java.util.Scanner;

class GamerZone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of players:");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter player scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        Leaderboard.quickSort(scores, 0, n - 1);

        System.out.println("Leaderboard (High to Low):");
        for (int i = n - 1; i >= 0; i--) {   
            System.out.print(scores[i] + " ");
        }
    }
}
