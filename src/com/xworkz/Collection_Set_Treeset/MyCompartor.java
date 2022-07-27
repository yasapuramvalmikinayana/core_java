package com.xworkz.Collection_Set_Treeset;

import java.util.Comparator;

public class MyCompartor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		StringBuffer sb1=(StringBuffer)o1;
		StringBuffer sb2=(StringBuffer)o2;
		String s1 =sb1.toString();
		String s2 =sb2.toString();
		//return 0;
		//return s1.compareTo(s2);
		return -s1.compareTo(s2);
	}

}
