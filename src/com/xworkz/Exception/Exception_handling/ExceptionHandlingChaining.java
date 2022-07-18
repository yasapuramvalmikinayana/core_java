package com.xworkz.Exception.Exception_handling;

public class ExceptionHandlingChaining {
	
	public static void main(String[]args) {
		
		System.out.println("main started");
		int a =10;
		int b =20;
		
		try {
			System.out.println(b/a);
			String s ="nayan";
			s = null;
			System.out.println("start of try block");
		
		}
		catch(Exception e){
			e.printStackTrn  ace();
			
		}
		finally {
			System.out.println("finally excuted");
			
		}
		System.out.println("main ended");
	}
}
		


