package com.xworkz.inheritance.multilevel_inheritance.bird;

public class BirdRunner {
	public static void main(String[] args) {
		Bird bird =new Bird();
		Peacock peacock=new Peacock();
		Babypeacock babypeacock= new Babypeacock();
		
		bird.fly();
		babypeacock.dance();
		babypeacock.play();
		babypeacock.follow();
	}

}
