package com.xworkz.finalize_method;

public class Birayani {
	String type;
	double price;
	
	Birayani(double price,String type){
		this.type=type;
		this.price=price;
		
	}

	@Override
	protected void finalize() throws Throwable {
	System.out.println("i love biryani");
		super.finalize();
	}

	@Override
	public String toString() {
		return "Birayani [type=" + type + ", price=" + price + "]";
	}

}
