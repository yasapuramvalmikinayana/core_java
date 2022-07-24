package com.xworkz.javapractice.defaultvalues;

public class Solution {
	

	public static void main(String[] args) {
		Employee S1=new Employee();
		Employee S2=new Employee();
		Employee S3=new Employee();
		System.out.println(S1.id+" "+S1.name+" "+S1.salary);
		
		
		S2.id= 32;
		S2.name="nayana";
		S2.salary=20000.00;
		S3.id=56;
		S3.name="srujan";
		S3.salary=30000.00;
	
		System.out.println(S2.id+" "+S2.name+" "+S2.salary);
		System.out.println(S3.id+" "+S3.name+" "+S3.salary);
		
		
		
	}

}
