package com.xworkz.Exception.Exception_handling;

public class Runner {
	public static void main(String[]args) {
		try {
			System.out.println(10/0);
		
		}
		catch(ArithmeticException e) {
			System.out.println("invalid denominator");
		}
	}

}
