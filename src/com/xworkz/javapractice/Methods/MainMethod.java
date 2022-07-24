package com.xworkz.javapractice.Methods;

public class MainMethod {

	public static void main(String[] args) {
		MethodSolution M = new MethodSolution();
		M.m1();
		System.out.println("----");
		M.m2("killer",35);
		System.out.println("killer"+" "+35);
		String company=M.m3();
		System.out.println(company);
		int sum =M.m4(4,5);
		System.out.println(sum);
		System.out.println(M.m4(12,56));
	

	}

}
