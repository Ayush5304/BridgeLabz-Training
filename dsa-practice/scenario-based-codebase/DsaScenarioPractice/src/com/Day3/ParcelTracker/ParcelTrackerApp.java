package com.Day3.ParcelTracker;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();

        tracker.addCheckpoint("Shipped", "Reached Warehouse");
        tracker.trackParcel();

        tracker.markParcelLost();
        tracker.trackParcel();
    }
}
