package com.xworkz.Lipstick;

public class Lipstick {
	String name;
	int price;

	Lipstick(String name, int price)
	{
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Lipstick [name=" + name + ", price=" + price + "]";
	}
	

}
