package com.xworkz.clonemethod;

public class Soap implements Cloneable{
	String brand;
	String color;
	Double price;

	Soap(String brand, String color, Double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Soap copy() throws CloneNotSupportedException {
		Object obj = super.clone();
		Soap soap = (Soap) obj;
		return soap;

	}

	@Override
	public String toString() {
		return "Soap [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

}
