package com.xworkz.finalize_method;

public class FinalizeMethodDemo {
	public static void main(String[] args) {
		Birayani b = new  Birayani(500.00,"hyderabad");
		b=null;
		System.gc();
		System.out.println(b);
		
		
		
		
		
	}

}
