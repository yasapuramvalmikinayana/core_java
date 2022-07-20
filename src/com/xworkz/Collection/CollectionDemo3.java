package com.xworkz.Collection;

import java.util.ArrayList;

public class CollectionDemo3 {
	public static void main(String[]args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(34);
		l.add(15);
		l.add(null);
		l.add("java");
		System.out.println(l);
		
		System.out.println("---");
		/*size()is used to return the length of the collection*/
		System.out.println(l.size());
		
		System.out.println("---");
		
		System.out.println(l.get(2));
		/*get() is used to return based on the index position*/
		System.out.println("---");
		/*contains() is used to check if the object is present in  the collection or not*/
		
		System.out.println(l.contains("java"));
		System.out.println(l.contains("java"));
		
		System.out.println("---");
		System.out.println(l);
		l.remove(2);
		/* remove() is used to remove an object on the index position*/
		System.out.println(l);
		System.out.println("---");
		System.out.println(l.isEmpty());
		l.clear();
	/* clear() will remove all the objects from the collections*/
		System.out.println(l.isEmpty());
		System.out.println("---");
		ArrayList x =new ArrayList();
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		x.add(60);
		System.out.println(x);
		
		System.out.println("---");
		/*indexof() is used to find the index position of an object and first occurance in case of suplication*/
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(100));//-1 if the object is not present
		System.out.println("--");
		/*lastIndexof() is used to find the last index position of an object*/
		System.out.println(x.lastIndexOf(10));
		
	}

}
