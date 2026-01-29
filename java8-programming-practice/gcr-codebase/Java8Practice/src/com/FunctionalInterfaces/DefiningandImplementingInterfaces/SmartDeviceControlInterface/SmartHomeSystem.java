package com.FunctionalInterfaces.DefiningandImplementingInterfaces.SmartDeviceControlInterface;

public class SmartHomeSystem {
    public static void main(String[] args) {

        SmartDevice[] devices = {
                new Light(),
                new AC(),
                new TV()
        };

        for (SmartDevice d : devices) {
            d.turnOn();
            d.turnOff();
        }
    }
}

