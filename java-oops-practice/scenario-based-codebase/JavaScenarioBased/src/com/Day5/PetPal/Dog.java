package com.Day5.PetPal;

class Dog extends Pet {

    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void feed() {
        decreaseHunger(20);
        increaseMood(10);
        System.out.println(name + " enjoyed the food!");
    }

    @Override
    public void play() {
        decreaseEnergy(20);
        increaseMood(20);
        System.out.println(name + " is playing fetch!");
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
        System.out.println(name + " is sleeping peacefully.");
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}
