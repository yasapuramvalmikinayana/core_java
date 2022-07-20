package com.xworkz.array.arraylist;

import java.util.ArrayList;

public class CollectionDemo2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add("Nayana");
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		  al2.add("naveen");
		  al2.addAll(al);

		  System.out.println(al2);

		  boolean check=al2.contains("naveen:");
		  System.out.println("al2 is empty:" +al2.isEmpty());
		  System.out.println("search naveen:" +check);
		  al2.remove("naveen");
		  al2.retainAll(al);

		}

	}


