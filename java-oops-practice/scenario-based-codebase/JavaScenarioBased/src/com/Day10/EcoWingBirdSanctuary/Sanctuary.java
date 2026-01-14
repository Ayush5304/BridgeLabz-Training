package com.Day10.EcoWingBirdSanctuary;

import java.util.*;

class Sanctuary {

    private Map<String, Bird> birds = new HashMap<>();

    public void addBird(Bird bird) {
        birds.put(bird.getId(), bird);
    }

    public void removeBird(String id) {
        birds.remove(id);
    }

    public void displayAllBirds() {
        for (Bird b : birds.values()) {
            System.out.println(b.getInfo());
        }
    }

    public void displayFlyingBirds() {
        for (Bird b : birds.values()) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (Bird b : birds.values()) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds.values()) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}
