package com.xworkz.Collection_Set_Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithStringBuffer {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyCompartor());
		ts.add(new StringBuffer("3"));
		ts.add(new StringBuffer("2"));
		ts.add(new StringBuffer("6"));
		ts.add(new StringBuffer("7"));
		ts.add(new StringBuffer("4"));
		ts.add(new StringBuffer("1"));
		ts.add(new StringBuffer("5"));
		System.out.println(ts);
		
	}

}
