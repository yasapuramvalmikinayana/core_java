package com.xworkz.Exception.CallStackDemo;

public class CallStackDemo {

	public static void main(String[] args) {
		try {
			int result = computeDivision(20,30);
					System.out.println("result of division:" + result);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

	static int divide(int a, int b) {
		return a / b;
	}

	static int computeDivision(int a, int b) {
		return divide(a, b);
	}

}
