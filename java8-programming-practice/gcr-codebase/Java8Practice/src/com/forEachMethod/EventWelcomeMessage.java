package com.forEachMethod;

import java.util.*;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Ayush", "Rohit", "Neha", "Karan", "Pooja"
        );

        System.out.println(" Welcome Messages:\n");

        attendees.stream()
                 .forEach(name -> 
                     System.out.println("Welcome to the event, " + name + "! 😊")
                 );
    }
}
