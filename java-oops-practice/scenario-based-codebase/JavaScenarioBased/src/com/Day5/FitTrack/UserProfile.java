package com.Day5.FitTrack;

class UserProfile {

    private String name;
    private int age;
    private double weight;     
    private int dailyTarget;   

    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = 500; 
    }

    public UserProfile(String name, int age, double weight, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = dailyTarget;
    }

    public double getWeight() {
        return weight;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }
}
