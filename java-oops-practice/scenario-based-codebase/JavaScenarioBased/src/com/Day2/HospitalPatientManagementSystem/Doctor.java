package com.Day2.HospitalPatientManagementSystem;

class Doctor {

    private String doctorName;
    private String specialization;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + doctorName + ", Specialization: " + specialization);
    }
}
