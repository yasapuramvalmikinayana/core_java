package com.xworkz.Collection.ArrayList;

public class Book {
	private String brand;
	private int noofpages;
	private double price;
	

	public Book(String brand, int noofpages, double price) {
		super();
		this.brand= brand;
		this.noofpages = noofpages;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoofpages() {
		return noofpages;
	}
	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [brand=" + brand + ", noofpages=" + noofpages + ", price=" + price + "]";
	}
	 

}
