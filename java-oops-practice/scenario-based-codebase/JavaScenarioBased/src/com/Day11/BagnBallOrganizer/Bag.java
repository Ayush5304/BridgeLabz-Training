package com.Day11.BagnBallOrganizer;

import java.util.ArrayList;

public class Bag implements Storable {

    private int bagId;
    private String color;
    private int capacity;

    private ArrayList<Ball> balls;

    public Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public int getBagId() {
        return bagId;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBallCount() {
        return balls.size();
    }

    public void addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added to Bag " + bagId);
        } else {
            System.out.println("Bag is FULL! Cannot add more balls.");
        }
    }

    public void removeBall(int ballId) {
        for (Ball b : balls) {
            if (b.getBallId() == ballId) {
                balls.remove(b);
                System.out.println("Ball removed from Bag " + bagId);
                return;
            }
        }
        System.out.println("Ball not found in this bag.");
    }

    public void displayBalls() {
        System.out.println("\nBalls in Bag " + bagId + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Bag ID: " + bagId +
                " | Color: " + color +
                " | Capacity: " + capacity +
                " | Balls inside: " + balls.size());
    }
}
