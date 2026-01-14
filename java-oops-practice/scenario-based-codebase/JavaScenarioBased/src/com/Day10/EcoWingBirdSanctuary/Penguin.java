package com.Day10.EcoWingBirdSanctuary;

class Penguin extends Bird implements Swimmable {

    public Penguin(String name, String id) {
        super(name, id, "Penguin");
    }

    public void swim() {
        System.out.println("Penguin swims swiftly underwater.");
    }
}
