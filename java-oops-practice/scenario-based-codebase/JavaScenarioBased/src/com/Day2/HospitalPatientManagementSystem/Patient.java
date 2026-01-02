package com.Day2.HospitalPatientManagementSystem;

public class Patient {
private int age;
private String name;
private String medicalHistory;

// normal admission constructor
public Patient(String name, int age) {
	this.age=age;
	this.name=name;
	this.medicalHistory="Not Disclosed";
}
//emergency admission constructor
public Patient(String name, int age, String medicalHistory) {
	this.age=age;
	this.name=name;
	this.medicalHistory=medicalHistory;
}
public String getSummary() {
return "Patient Name"+ name+ ", Age" + age;
}
public void displayInfo() {
	System.out.println(getSummary());
}
}
