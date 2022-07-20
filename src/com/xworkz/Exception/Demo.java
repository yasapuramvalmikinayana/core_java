package com.xworkz.Exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[]args) {
		System.out.println("start");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value of a");
		int a =scan.nextInt();
		System.out.println("enter a value of b");
		int b =scan.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
	System.out.println("dabba fellow,do not divide by 0");
		}
		scan.close();
		System.out.println("end");
		
		
	}

}
