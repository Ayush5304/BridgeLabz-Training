package com.Day9.UniversitysDigitalRecordSystem;

public class Student {
     int rollNo;
    String name;
    String department;
    Student left, right;
	public Student(int rollNo, String name, String department ) {
	this.rollNo=rollNo;
	this.name=name;
	this.department=department;
	left=right=null;
	}
   public String toString() {
	   return " id " + rollNo+ " name "+ name+" department" + department;
   }
}
