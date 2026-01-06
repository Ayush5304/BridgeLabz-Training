package com.Day5.PetPal;

import java.util.Random;

abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;  
    private int energy;   
    private int mood;     

    public Pet(String name, String type) {
        Random r = new Random();
        this.name = name;
        this.type = type;
        this.age = r.nextInt(10) + 1;
        this.hunger = r.nextInt(50);
        this.energy = r.nextInt(50) + 50;
        this.mood = r.nextInt(50) + 50;
    }

    // User-defined constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        this.mood = 50;
    }

    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
    }

    protected void decreaseEnergy(int value) {
        energy = Math.max(0, energy - value);
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
    }

    protected void increaseMood(int value) {
        mood = Math.min(100, mood + value);
    }

    public void showStatus() {
        System.out.println(type + " Status -> Hunger: " + hunger +", Energy: " + energy + ", Mood: " + mood);
    }

    abstract void makeSound();
}
