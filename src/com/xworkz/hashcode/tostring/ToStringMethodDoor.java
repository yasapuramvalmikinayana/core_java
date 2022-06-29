package com.xworkz.hashcode.tostring;

public class ToStringMethodDoor {
	public static void main(String[] args) {
		
		Door door = new Door("wood",40.05,"black");
		Door door2 = new Door("wood", 30.05,"black");
		System.out.println(door.getClass());
		System.out.println(door2.getClass());
	}

}
