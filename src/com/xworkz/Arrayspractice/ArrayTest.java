package com.xworkz.Arrayspractice;

public class ArrayTest {


	public static void main(String[]args) {
		int[] a= {10,20,30,40,50,60,70};
		
		for(int i=0; i<a.length; i++)
		{
		
		System.out.println(a[i]);
		}
		int[] n= {10,20,30};
		int sum =0;
		for(int i=0; i<n.length; i++)
		{
			sum = sum + n[i];
			
		}
		System.out.println("sum:"+sum);
		System.out.println("average:"+(sum/n.length));
		
			
		}
		
		
	
		
		
	}


