package com.xworkz.Lipstick.watch;

public class Watch {
	String brand;
	int price;
	String color;
	Watch(String brand,int price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
