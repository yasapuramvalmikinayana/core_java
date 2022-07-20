package com.xworkz.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoWithTypeSafe {
	public static void main(String[] args) {

		Book classmate = new Book("classmate",100,40.00);
	//classmate.setBrand("classmate");
	//classmate.setNoofpages(100);
	//classmate.setPrice(40.00);

		Book suleka = new Book("chinnu", 200, 50.00);
	//suleka.setBrand("chinnu");
	//suleka.setNoofpages(200);
		//suleka.setPrice(50.00);

		ArrayList<Book> al = new ArrayList<Book>();
		al.add(classmate);
		al.add(suleka);
		
		Iterator<Book> itr=al.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			System.out.println(book);
		}

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getBrand()== "chinnu") {
				System.out.println(al.get(i));
			}
		}
		for (Book book : al) {
			if (book.getPrice() == 50.00) {
				System.out.println(book);
			}
		
				
			}
			
			for (Iterator iterator = al.iterator();
					iterator.hasNext();) {
				Book book2 = (Book) iterator.next();
				System.out.println(book2);
				
			}
			

		}
	}

