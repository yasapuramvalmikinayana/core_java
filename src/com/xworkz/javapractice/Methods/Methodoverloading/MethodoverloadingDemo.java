package com.xworkz.javapractice.Methods.Methodoverloading;

public class MethodoverloadingDemo {
	void display()
	{
		System.out.println("hello dabba fellow");
	}
	void display(int x) {
		System.out.println(x);
	}
	void display(String x, double y) {
		System.out.println(x+" "+y);
	}
	void display(int x,String y ) {
		System.out.println(x+" "+y);
	}

}
