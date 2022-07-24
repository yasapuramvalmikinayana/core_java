package com.xworkz.Collection_Set_HashSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add('S');
		hs.add("nayan");
		hs.add('n');
		hs.add("null");
		hs.add("vanitha");
		System.out.println(hs);
        System.out.println(hs.remove('S'));//remove v its when its true
        System.out.println(hs);
        System.out.println(hs.add("nayan"));//add a also added and true 
        System.out.println(hs);
        System.out.println(hs.contains(null));//contains are present so its false
        System.out.println(hs);
        System.out.println(hs.equals('n'));
        System.out.println(hs);
        System.out.println(hs.removeAll(hs));//remove all elements and its true
        System.out.println(hs);
        System.out.println(hs.retainAll(hs));
        System.out.println(hs);
        System.out.println(hs.isEmpty());//because removing values then is empty is true value
        System.out.println(hs.iterator());
        System.out.println(hs.size());//empty so size is 0
        System.out.println(hs.retainAll(hs));
        System.out.println(hs);
        
	}




	}


