package com.Day5.PetPal;

class Cat extends Pet {

    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void feed() {
        decreaseHunger(15);
        increaseMood(5);
        System.out.println(name + " ate quietly.");
    }

    @Override
    public void play() {
        decreaseEnergy(10);
        increaseMood(15);
        System.out.println(name + " is playing with a ball.");
    }

    @Override
    public void sleep() {
        increaseEnergy(40);
        System.out.println(name + " is napping.");
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
