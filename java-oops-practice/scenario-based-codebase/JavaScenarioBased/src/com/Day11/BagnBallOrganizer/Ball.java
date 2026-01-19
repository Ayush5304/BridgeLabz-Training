package com.Day11.BagnBallOrganizer;

public class Ball implements Storable {

    private int ballId;
    private String color;
    private String size;  

    public Ball(int ballId, String color, String size) {
        this.ballId = ballId;
        this.color = color;
        this.size = size;
    }

    public int getBallId() {
        return ballId;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ball ID: " + ballId +
                " | Color: " + color +
                " | Size: " + size);
    }
}
