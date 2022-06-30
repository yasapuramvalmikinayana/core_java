package com.xworkz.array;

public class ArrayDemoInt {
	public static void main(String[]args) {
		int[] arr = new int[4];
		
		int num =1;
		for (int i =0; i< arr.length ; i++) {
			arr[i] = num;
			num++;
			
		}
		for(int i =0; i< arr.length ; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
