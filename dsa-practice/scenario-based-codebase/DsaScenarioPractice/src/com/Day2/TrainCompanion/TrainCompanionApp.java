package com.Day2.TrainCompanion;

public class TrainCompanionApp {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Engine");
        train.addCompartment("General");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("General");

        train.traverseForward();
    }
}
