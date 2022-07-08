package com.xworkz.String;

public class StringDemoExample {
	public static void main(String[]args) {
		

	String name="rishi";
	String name1="rishi";
	System.out.println(name==name1);
	
	String sanmith=new String("sanmith");
	String internsanmith=sanmith.intern();
	System.out.println(sanmith==internsanmith);
	String sannu="sanmith";
	name1="kushal";
	System.out.println(name==name1);
	
	String sanmith1=new String("sanmith");
	String intern=sanmith1.intern();
	System.out.println(intern==sanmith1);
	
	
	
	
	

}
}
