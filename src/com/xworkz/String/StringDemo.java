package com.xworkz.String;

public class StringDemo {
	public static void main(String[]args) {
	
	String name ="srujana";//literal
	String name1 ="srujana";
	System.out.println(name==name1);
	 
	String nayana=new String("nayana");//new keyword
	String internnayana=nayana.intern();
	System.out.println(nayana==internnayana);
	
	String nayan="nayana";
	System.out.println(internnayana==nayan);
	
	name1="naveen";
	System.out.println(name==name1);
	
	String nayana1=new String("nayana");
	String intern=nayana1.intern();
	System.out.println(intern==nayana1);

	
	
	
	
	

}
}
