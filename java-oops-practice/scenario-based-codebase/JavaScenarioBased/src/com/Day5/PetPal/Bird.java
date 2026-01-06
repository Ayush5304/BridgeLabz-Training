package com.Day5.PetPal;

class Bird extends Pet {

    public Bird(String name) {
        super(name, "Bird");
    }

    @Override
    public void feed() {
        decreaseHunger(10);
        increaseMood(5);
        System.out.println(name + " pecked some seeds.");
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseMood(10);
        System.out.println(name + " is flying around!");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " is resting.");
    }

    @Override
    void makeSound() {
        System.out.println("Chirp Chirp!");
    }
}
