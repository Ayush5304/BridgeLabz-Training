package com.Day5.FitTrack;

class ProgressTracker {

    public static int calculateProgress(int dailyTarget, int caloriesBurned) {
        return dailyTarget - caloriesBurned;
    }
}
