package com.Day5.FitTrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    void calculateCalories() {
        caloriesBurned = duration * 8; 
    }
}
