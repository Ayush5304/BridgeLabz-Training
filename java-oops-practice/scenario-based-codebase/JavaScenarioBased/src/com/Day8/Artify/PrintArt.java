package com.Day8.Artify;

public class PrintArt extends Artwork {
    
	public PrintArt(String title, String artist, double price, String licenseType) {
	super(title, artist, price, licenseType);
	}
 @Override
    public void purchase(User user) {	
 if(user.getwalletBalance()>=price) {
	 user.deductAmount(price);
	 System.out.println(user.getName()+ "purchased printArt:" +title);
 }
 else {
	 System.out.println("Insufficient balance");
 }
}
 @Override
	public void license(User user) {
		System.out.println("printArt is licensed for some commercial use");
	}
}