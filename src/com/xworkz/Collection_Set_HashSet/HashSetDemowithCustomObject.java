package com.xworkz.Collection_Set_HashSet;

import java.util.HashSet;

public class HashSetDemowithCustomObject{
		public static void main(String[] args) {
			TrainHashset ths=new  TrainHashset();
			ths.setName("rani chennamma");
			ths.setNoofcompartments(12);
	        ths.setNumber(12345);
	        ths.setSource("banglore");
	        ths.setDestination("dharwad");
	        
	        TrainHashset ths1=new TrainHashset();
	        ths1.setName("shatabdi");
	        ths1.setNumber(13456);
	        ths1.setNoofcompartments(14);
	        ths1.setSource("mysore");
	        ths1.setDestination("banglore");
	        
	        TrainHashset ths2=new TrainHashset();
	        ths2.setName("shatabdi");
	        ths2.setNumber(13456);
	        ths2.setNoofcompartments(14);
	        ths2.setSource("mysore");
	        ths2.setDestination("banglore");
		
		
	        HashSet hs=new HashSet();
	        hs.add(ths1);
	        hs.add(ths);
	        hs.add(ths2);
	        
	        System.out.println(hs);
		}

	
	}

