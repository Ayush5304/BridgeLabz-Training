package com.Day9.MedWarehouse;

public class Medicine {
    public String medicineName;
    public int expiryDate;
    
	public Medicine(String medicineName, int expiryDate) {
	this.medicineName=medicineName;
	this.expiryDate= expiryDate;
	}
	public String toString() {
		return " medicineName "+ medicineName+ " expiryDate "+ expiryDate;
	}
}
