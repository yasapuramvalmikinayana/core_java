package com.xworkz.hashcode.tostring.computer;

public class Computer {
	String type;
	String color;
	Double price;
	
	Computer(String type,String color,Double price){
		this.type = type;
		this.color = color;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Computer [type=" + type + ", color=" + color + ", price=" + price + "]";
	}

}
