package com.Day7.FitnessTracker;

public class UserSteps {
    int id;
    String name;
    int steps;

    public UserSteps(int id, String name, int steps) {
        this.id = id;
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + steps + " steps";
    }
}
