package com.Day7.FitnessTracker;

public class FitnessTracker {

    public static void bubbleSort(UserSteps[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].steps < arr[j + 1].steps) {

                    UserSteps temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {

        UserSteps[] users = {
                new UserSteps(1, "Aman", 8500),
                new UserSteps(2, "Rahul", 12000),
                new UserSteps(3, "Neha", 9500),
                new UserSteps(4, "Priya", 7000),
                new UserSteps(5, "Rohit", 11000)
        };

        bubbleSort(users);

        System.out.println("Daily Step Leaderboard:");
        int rank = 1;
        for (UserSteps u : users) {
            System.out.println("Rank " + rank++ + " → " + u);
        }
    }
}
