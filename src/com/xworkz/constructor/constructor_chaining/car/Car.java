package com.xworkz.constructor.constructor_chaining.car;

public class Car {
	String model;
	String color;
	String  price;
	Car()
	{
		this("i20","black","200000");
	}
	Car(String model,String clr)
	{
		this.model=model;
		this.color=clr;
		System.out.println("Car name...!");
		}
		Car(String model,String clr,String price)
		{
			this("i20","Black");
			this.model=model;
			this.price=price;
			
		}
	}

