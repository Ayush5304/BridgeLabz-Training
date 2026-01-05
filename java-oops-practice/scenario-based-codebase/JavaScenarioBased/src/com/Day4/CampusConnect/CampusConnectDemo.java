package com.Day4.CampusConnect;

public class CampusConnectDemo {

	public static void main(String[] args) {
	Faculty f1= new Faculty(1, "Mr.Sharma", "sharma@college.edu.in");
	Course java=new Course("Java programming", f1);
	int [] grades= {8,9,7};
	Student s1= new Student (101, "Ayush", "ayush@college.edu.in",grades);

	s1.enrollCourse(java);
	s1.printDetails();
	f1.printDetails();

}
}