package com.xworkz.javapractice.defaultvalues;

public class Car {
	int cost=10;
	public static void main(String[] args) {
		Car C1=new Car();
		Car C2=new Car();
		System.out.println(C1.cost+" "+C2.cost);
		C1.cost=45;
		C2.cost =20;
		System.out.println(C1.cost+" "+C2.cost);
	}

}
