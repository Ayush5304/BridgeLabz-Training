package com.Day8.Artify;

public class DigitalArt extends Artwork {
    
	public DigitalArt(String title, String artist, double price, String licenseType) {
	super(title, artist, price, licenseType);
	}
	@Override
 public void purchase(User user) {	
 if(user.getwalletBalance()>=price) {
	 user.deductAmount(price);
	 System.out.println(user.getName()+ "purchased digital art:" +title);
 }
 else {
	 System.out.println("Insufficient balance");
 }
}
	@Override
	public void license(User user) {
		System.out.println("Digital art license with:"+ licenseType+ "license");
	}
}