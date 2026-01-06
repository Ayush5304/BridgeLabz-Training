package com.Day5.FitTrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    void calculateCalories() {
        caloriesBurned = duration * 5; 
    }
}
