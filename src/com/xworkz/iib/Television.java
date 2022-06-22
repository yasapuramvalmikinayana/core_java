package com.xworkz.iib;

public class Television {
	String brand;
	double price;
	static String type;
    static String dimensions;
	
	Television(){
		System.out.println("I am Constructor.");
		
	}
	
	{
		System.out.println("I am IIB");
		this.brand ="TCL";
		this.price = 10000.00;
		this.dimensions = "32 inches";
		this.type = "LED";
	}
	static {
		System.out.println("I am SIB.");
		dthprovider = "vediocon";
		
	}
	{
		System.out.println("I am SBI 2nd.");
		dthProvider = "videocon";
	}
	
}



