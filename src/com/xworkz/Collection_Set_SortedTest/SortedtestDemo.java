package com.xworkz.Collection_Set_SortedTest;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedtestDemo {

	public static void main(String[] args) {
		SortedSet ss= new TreeSet();
		
		ss.add("nayan");
		ss.add("z");
		ss.add("n");
		ss.add("s");
		ss.add("y");
		System.out.println(ss);
		System.out.println("first elemnt:"+ss.first());
		System.out.println("last element:"+ss.last());
		System.out.println("head elemnt:"+ss.headSet("n"));
		System.out.println("tail elemnt:"+ss.tailSet("n"));
		System.out.println("sub set:"+ss.subSet("s","y"));
		System.out.println("comparator:"+ss.comparator());
		

	
	}
}
