package com.xworkz.encapsulation;

public class Nayantest {
	public static void main(String[] args) {

		Nayan nayan = new Nayan();
		nayan.setName("nayana1");
		nayan.setColour("pink");
		nayan.setModel("promax");
		nayan.setPrice(50);
		nayan.setNumberofpens(9);
		
		System.out.println("pen :" + nayan.getName());
		System.out.println("pen :" +nayan.getColour());
		System.out.println("pen :"+nayan.getModel());
		System.out.println("pen :"+nayan.getPrice());
		System.out.println("pen:"+nayan.getNumberofpens());
		
	}
}
