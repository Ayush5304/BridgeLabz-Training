package com.Day5.EventEase;

class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date, int attendees,
                            double venueCost, double serviceCost) {
        super(eventName, location, date, attendees, venueCost, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference Scheduled with professional setup on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("📊 Conference Rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("📊 Conference Cancelled");
    }
}
