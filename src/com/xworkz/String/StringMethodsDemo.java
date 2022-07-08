package com.xworkz.String;

public class StringMethodsDemo {
	public static void main(String[] args) {
		String name = "pavan";
		String UpperCaseName = name.toUpperCase();
		System.out.println("name :"+name);
		System.out.println("UpperCaseName");
	
		String Sirname = " mallela";
		String cancatinatedName = name.concat(Sirname);
		System.out.println("cancatinatedName :"+cancatinatedName);
		System.out.println("char at 1 in name :"+name.charAt(3));
		System.out.println(cancatinatedName.contains(" mallela"));
		System.out.println(cancatinatedName.endsWith("ela"));
		String[] splittedstr = cancatinatedName.split(" ");
		System.out.println("words in concatinated name :"+splittedstr.length);
				
		
	}

}
