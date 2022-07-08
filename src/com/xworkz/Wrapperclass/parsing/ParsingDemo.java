package com.xworkz.Wrapperclass.parsing;

public class ParsingDemo {
	public static void main(String[] args) {
		String s ="1234";
		String s1 ="false1";
		Boolean btrue = Boolean.parseBoolean(s);
		Boolean bfalse = Boolean.parseBoolean(s1);
		System.out.println("btrue:"+btrue);
		System.out.println("bfalse:"+bfalse);
		String str = "12";
		String str1 = "20";
		Integer i = Integer.parseInt(str);
		Integer j = Integer.parseInt(str1);
		
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		
		
	}

}
