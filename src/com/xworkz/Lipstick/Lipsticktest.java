package com.xworkz.Lipstick;

public class Lipsticktest {
	public static void main(String[]args) {
		Lipstick lipstick0=new Lipstick("mayglame", 220);
		Lipstick lipstick1=new Lipstick("streetwear",100);
		Lipstick lipstick2=new Lipstick("lakme",200);
		Lipstick lipstick3=new Lipstick("sugar",50);
		Lipstick lipstick4=new Lipstick("huda",600);
		
		Lipstick[] Lipsticks= {lipstick0,lipstick1,lipstick2,lipstick3,lipstick4};
		for (int i = 0; i < Lipsticks.length; i++) {
			System.out.println(Lipsticks[i]);
		}
	}}
	
