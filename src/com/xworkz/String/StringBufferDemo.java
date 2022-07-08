package com.xworkz.String;

public class StringBufferDemo {
	public static void main(String[]args) {
		StringBuffer city = new StringBuffer("hyderbad");
		city.append(" city");
		
		System.out.println(city);
		
		System.out.println(city .capacity());
	}

}
