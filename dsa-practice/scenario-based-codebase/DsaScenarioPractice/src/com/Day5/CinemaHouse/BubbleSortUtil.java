package com.Day5.CinemaHouse;

public class BubbleSortUtil {

    public static void bubbleSortShows(MovieShow[] shows, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (shows[j].getShowTime() > shows[j + 1].getShowTime()) {

                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }
}
