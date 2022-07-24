package com.xworkz.javapractice.defaultvalues;

public class Student {
String name;
int marks;
public static void main(String[] args) {
	Student S1=new Student();
	Student S2=new Student();
	System.out.println(S1.name+" "+S1.marks);
	S1.name="srujan";
	S1.marks=50;
	S2.name="tom";
	S2.marks=35;
	System.out.println(S1.name+" "+S2.marks);
	System.out.println(S2.name+" "+S2.marks);
	
	System.out.println(S1.name + "has scored" + S1.marks+"marks in java");
	System.out.println(S2.name + "has scored" + S2.marks+"marks in java");
	
	
}

}
