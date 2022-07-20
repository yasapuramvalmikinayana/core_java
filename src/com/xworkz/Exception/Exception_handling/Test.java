package com.xworkz.Exception.Exception_handling;

public class Test {
	public static void main(String[]args) {
		System.out.println("start");
		int[] a = {10,20,30};
		try
		{
		System.out.println(a[55]);	
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
		}
		System.out.println("end");
		
	}

}
