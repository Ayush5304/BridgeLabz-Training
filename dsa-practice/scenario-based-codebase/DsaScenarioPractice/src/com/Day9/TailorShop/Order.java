package com.Day9.TailorShop;

public class Order {
    private int id;
    private String customerName;
    public int deliveryDate;
	public Order(int id, String customerName, int deliveryDate) {
	this.id=id;
	this.customerName= customerName;
	this.deliveryDate=deliveryDate;
	}
	public String toString() {
		return " id " + id + " customerName "+ customerName+ " deliveryDate "+ deliveryDate;
	}
}
