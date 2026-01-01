package com.encapsulationandpolymorphism.LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

