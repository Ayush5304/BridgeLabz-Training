package com.Day8.Artify;

public class ArtifyApp {
	public static void main(String[] args) {
	User user=new User("Ayush", 50000);
	
     Artwork art1= new DigitalArt("satellite dream", "Ayush", 1000, "commercial");
    Artwork art2= new PrintArt("satellite dream", "Ayush", 5000, "personal");
    
    art1.purchase(user);
    art1.license(user);
    art2.purchase(user);
    art2.license(user);
	
    System.out.println("After purchasing and liscensing the artwork balance left : "+ user.getwalletBalance());
}
}