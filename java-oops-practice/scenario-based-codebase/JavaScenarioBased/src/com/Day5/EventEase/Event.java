package com.Day5.EventEase;

abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;          // cannot be modified
    private static int idCounter = 100;

    private double venueCost;
    private double serviceCost;
    private double discount;

    public Event(String eventName, String location, String date, int attendees, double venueCost) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
        this.eventId = idCounter++;
    }

    public Event(String eventName, String location, String date, int attendees,
                 double venueCost, double serviceCost, double discount) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.eventId = idCounter++;
    }

    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }
}
