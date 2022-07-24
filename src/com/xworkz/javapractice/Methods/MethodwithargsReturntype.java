package com.xworkz.javapractice.Methods;

public class MethodwithargsReturntype {
	int findsquare(int n)
	{
		return n*n;
	}
	public static void main(String[] args) {
		MethodwithargsReturntype M=new MethodwithargsReturntype();
		 int result=M.findsquare(6);
		// System.out.println(M.findsquare(6));
		 System.out.println(result);
	}

}
