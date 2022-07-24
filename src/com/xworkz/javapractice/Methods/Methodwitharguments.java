package com.xworkz.javapractice.Methods;

class Methodwitharguments {
	 void addition(int a,int b)
	 {
		//[ System.out.println(a+b);
		 System.out.println("sum of "+a+"&"+b+"is"+(a+b));
	 }
	 public static void main(String[] args) {
		
	 Methodwitharguments object=new Methodwitharguments();
	 object.addition(10,20);
	 object.addition(7,4);
	 object.addition(30,90);
	 
}
}
