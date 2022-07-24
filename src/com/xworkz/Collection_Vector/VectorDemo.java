package com.xworkz.Collection_Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vect=new Vector();
		vect.add('A');
		vect.add('B');
		vect.add('C');
		vect.add('D');
		vect.add("Nayana");
		System.out.println(vect);
		
		Vector vector=new Vector();
		vect.add("Anatapur");
		vector.addAll(vect);
		System.out.println(vector);
		
		System.out.println(vect.firstElement());
		System.out.println(vect.elementAt(3));
		System.out.println(vect.capacity());
		System.out.println(vect.remove(3));
		System.out.println(vect.removeAll(vect));
		
		int count=0;
		Enumeration<Character>enumeration=vector.elements();
		while(enumeration.hasMoreElements());{
			System.out.println(enumeration.nextElement());
			count++;

}
	}
}
