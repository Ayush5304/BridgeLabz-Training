package com.Day2.TrafficManager;

public class TrafficManagerApp {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.arriveAtQueue("CAR1");
        tm.arriveAtQueue("CAR2");
        tm.arriveAtQueue("CAR3");
        tm.arriveAtQueue("CAR4"); 

        tm.enterRoundabout();
        tm.enterRoundabout();
        tm.displayRoundabout();

        tm.exitRoundabout();
        tm.displayRoundabout();

        tm.enterRoundabout();
        tm.displayRoundabout();
    }
}
