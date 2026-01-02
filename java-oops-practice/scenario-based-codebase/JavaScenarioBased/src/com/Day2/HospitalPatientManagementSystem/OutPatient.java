package com.Day2.HospitalPatientManagementSystem;

class OutPatient extends Patient {

    public OutPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient visit");
        super.displayInfo();
    }
}
