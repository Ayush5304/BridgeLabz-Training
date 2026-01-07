package com.Day6.ParkEase;

class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String bookingLog; 

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
        this.bookingLog = "EMPTY";
    }

    public boolean assignSlot(Vehicle vehicle) {

        if (isOccupied ||  !vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            return false;
        }

        isOccupied = true;
        bookingLog = "Occupied by " + vehicle.vehicleNumber;
        return true;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "EMPTY";
    }

    public String getStatus() {
        return bookingLog;
    }
}
