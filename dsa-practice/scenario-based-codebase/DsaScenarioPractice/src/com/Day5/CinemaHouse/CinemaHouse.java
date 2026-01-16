package com.Day5.CinemaHouse;

public class CinemaHouse {

    public static void main(String[] args) {

        MovieShow[] shows = new MovieShow[10];

        shows[0] = new MovieShow("Avengers", 2130);
        shows[1] = new MovieShow("KGF", 1030);
        shows[2] = new MovieShow("RRR", 1830);
        shows[3] = new MovieShow("Pushpa", 1530);
        shows[4] = new MovieShow("Avatar", 1200);

        int totalShows = 5;

        System.out.println("Before Sorting Showtimes:");
        printShows(shows, totalShows);

        BubbleSortUtil.bubbleSortShows(shows, totalShows);

        System.out.println("\nAfter Sorting Showtimes:");
        printShows(shows, totalShows);
    }

    public static void printShows(MovieShow[] shows, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(shows[i]);
        }
    }
}
