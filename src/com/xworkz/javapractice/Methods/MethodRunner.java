package com.xworkz.javapractice.Methods;

public class MethodRunner {
	int m1() {
		return 10+10;
	}
	double m2() {
		return 10+10.6;
		
	}
	String m3() {
		return "name"+20;
	}
	public static void main(String[] args) {
		MethodRunner M=new MethodRunner();
		M.m2();
		System.out.println(M.m2());
		
	}

}
