package com.Day7.MediStore;

import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine tablet = new Tablet("Paracetamol",50,LocalDate.of(2026, 5, 10) );

        Medicine syrup = new Syrup("Cough Syrup", 120,LocalDate.of(2025, 1, 10) );

        tablet.sell(5);
        syrup.sell(2);
    }
}
