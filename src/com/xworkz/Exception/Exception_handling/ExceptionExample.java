package com.xworkz.Exception.Exception_handling;

public class ExceptionExample {
	public static void main(String[]args) {
		try {
		System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index value");
			
		}
		catch(NullPointerException e) {
			System.out.println("invalid");
		}
		catch(ArithmeticException e) {
			System.out.println("valid");
			}
		catch(Exception e) {
			System.out.println("superclass Exception handler");
		}
}

}
