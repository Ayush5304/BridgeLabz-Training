package com.Day5.EventEase;

class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date, int attendees, double venueCost, double serviceCost) {
        super(eventName, location, date, attendees, venueCost, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Event Scheduled on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🎂 Birthday Event Rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("🎂 Birthday Event Cancelled");
    }
}
