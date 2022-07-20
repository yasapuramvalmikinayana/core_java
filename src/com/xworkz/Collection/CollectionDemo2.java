package com.xworkz.Collection;

import java.util.ArrayList;

public class CollectionDemo2 {

		public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add("nayana");
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add("srujan");
		al2.addAll(al);
		System.out.println(al2);
		boolean check=al2.contains("srujan");
		System.out.println("al2 is empty:"+al2.isEmpty());
		System.out.println("search srujan:"+check);
		al2.remove("nayana");
		System.out.println(al2);
		al2.retainAll(al);
		System.out.println(al);
		
		


		}

	}

