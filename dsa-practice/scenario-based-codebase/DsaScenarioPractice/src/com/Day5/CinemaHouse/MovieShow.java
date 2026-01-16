package com.Day5.CinemaHouse;

public class MovieShow {
    private String movieName;
    private int showTime; 

    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public int getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return movieName + " (" + formatTime(showTime) + ")";
    }

    private String formatTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return String.format("%02d:%02d", hours, minutes);
    }
}
