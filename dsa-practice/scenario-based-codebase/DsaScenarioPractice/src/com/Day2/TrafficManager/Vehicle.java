package com.Day2.TrafficManager;

public class Vehicle {
    String number;
    Vehicle next;

    public Vehicle(String number) {
        this.number = number;
        this.next = null;
    }
}
