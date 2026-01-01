package com.encapsulationandpolymorphism.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Clean Code", "Robert Martin"));
        items.add(new Magazine(2, "Time", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {

            item.getItemDetails();

            Reservable r = (Reservable) item;
            if (r.checkAvailability()) {
                r.reserveItem("Alice");
            }

            System.out.println("");
        }
    }
}
