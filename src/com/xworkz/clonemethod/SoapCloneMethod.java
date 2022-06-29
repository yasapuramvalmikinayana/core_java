package com.xworkz.clonemethod;

public class SoapCloneMethod {
	public static void main(String []args) {
		Soap Santoor = new Soap("Santoor","white",40.00);
		Soap copyofSantoor = null;
		try {
			copyofSantoor = Santoor.copy();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		
		}
		System.out.println(Santoor == copyofSantoor);
		System.out.println(Santoor);
		System.out.println(copyofSantoor);
		
		
		
		
	}

}
