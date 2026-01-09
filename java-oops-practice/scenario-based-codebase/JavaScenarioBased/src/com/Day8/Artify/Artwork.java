package com.Day8.Artify;

abstract class Artwork implements  IPurchasable{
    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;
    
	public Artwork(String title, String artist, double price, String licenseType ) {
    this.title=title;
    this.artist=artist;
    this.price=price;
    this.licenseType= licenseType;
	}
  public abstract void license(User user) ;
}
