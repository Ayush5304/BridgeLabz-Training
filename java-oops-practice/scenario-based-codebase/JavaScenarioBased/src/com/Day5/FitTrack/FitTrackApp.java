package com.Day5.FitTrack;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Ayush", 22, 70.5, 600);

        Workout workout = new CardioWorkout(40);
        workout.startWorkout();

        workout.calculateCalories();

        workout.stopWorkout();

        int remaining = ProgressTracker.calculateProgress(
                user.getDailyTarget(),
                workout.getCaloriesBurned()
        );

        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Calories to Goal: " + remaining);
    }
}
