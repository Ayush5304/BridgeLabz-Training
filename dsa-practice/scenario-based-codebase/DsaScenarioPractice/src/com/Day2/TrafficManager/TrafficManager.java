package com.Day2.TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    private Vehicle tail = null; 
    private Queue<String> waitingQueue = new LinkedList<>();
    private int maxQueueSize = 3;

    public void arriveAtQueue(String vehicleNo) {
        if (waitingQueue.size() == maxQueueSize) {
            System.out.println("Queue Overflow: " + vehicleNo + " cannot enter");
            return;
        }
        waitingQueue.add(vehicleNo);
        System.out.println(vehicleNo + " added to waiting queue");
    }

    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow: No vehicle waiting");
            return;
        }

        String vehicleNo = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(vehicleNo);

        if (tail == null) {
            tail = newVehicle;
            tail.next = tail;
        } else {
            newVehicle.next = tail.next;
            tail.next = newVehicle;
            tail = newVehicle;
        }

        System.out.println(vehicleNo + " entered roundabout");
    }

    public void exitRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle head = tail.next;

        if (head == tail) {
            System.out.println(head.number + " exited roundabout");
            tail = null;
        } else {
            System.out.println(head.number + " exited roundabout");
            tail.next = head.next;
        }
    }

    public void displayRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = tail.next;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(back to start)");
    }
}
