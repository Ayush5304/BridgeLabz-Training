package com.encapsulationandpolymorphism.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
