package com.Day10.EcoWingBirdSanctuary;

class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, id, "Duck");
    }

    public void fly() {
        System.out.println("Duck flies short distances.");
    }

    public void swim() {
        System.out.println("Duck swims gracefully.");
    }
}
