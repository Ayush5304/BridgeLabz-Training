package com.Day10.EcoWingBirdSanctuary;

@DeveloperInfo(name = "EcoWing Team", version = "1.0")
abstract class Bird {

    private String name;
    private String id;
    private String species;

    public Bird(String name, String id, String species) {
        this.name = name;
        this.id = id;
        this.species = species;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getId() {
        return id;
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}
