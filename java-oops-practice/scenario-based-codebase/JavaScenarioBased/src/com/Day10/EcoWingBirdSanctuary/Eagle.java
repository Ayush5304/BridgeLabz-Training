package com.Day10.EcoWingBirdSanctuary;

class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, id, "Eagle");
    }

    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}
