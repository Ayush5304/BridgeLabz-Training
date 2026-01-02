package com.Day2.HospitalPatientManagementSystem;
class InPatient extends Patient {

    private int daysAdmitted;

    public InPatient(String name, int age, int daysAdmitted) {
        super(name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient admitted for " + daysAdmitted + " days");
        super.displayInfo();
    }
}
