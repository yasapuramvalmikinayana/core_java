package com.xworkz.Collection_Set_HashSet_LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedhashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("nayana");
		lhs.add("null");
		lhs.add('C');
		lhs.add('A');
		lhs.add("null");
	System.out.println(lhs);
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.remove('C'));
	System.out.println(lhs.size());
	System.out.println(lhs.removeAll(lhs));
	System.out.println(lhs.retainAll(lhs));
	
	}

}
