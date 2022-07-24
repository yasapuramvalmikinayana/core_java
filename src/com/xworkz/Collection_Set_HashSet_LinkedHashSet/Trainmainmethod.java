package com.xworkz.Collection_Set_HashSet_LinkedHashSet;

import java.util.LinkedHashSet;

public class Trainmainmethod {

	public static void main(String[] args) {
		TrainLinkedhashSet ths=new  TrainLinkedhashSet();

		ths.setName("rani chennamma");
		ths.setNoofcompartments(12);
        ths.setNumber(12345);
        ths.setSource("banglore");
        ths.setDestination("dharwad");
        
        TrainLinkedhashSet ths1=new TrainLinkedhashSet();
        ths1.setName("shatabdi");
        ths1.setNumber(13456);
        ths1.setNoofcompartments(14);
        ths1.setSource("mysore");
        ths1.setDestination("banglore");
        
        TrainLinkedhashSet ths2=new TrainLinkedhashSet();
        ths2.setName("shatabdi");
        ths2.setNumber(13456);
        ths2.setNoofcompartments(14);
        ths2.setSource("mysore");
        ths2.setDestination("banglore");
	
	     LinkedHashSet lhs=new LinkedHashSet() ;
             lhs.add(ths1);
             lhs.add(ths);
             lhs.add(ths2);
             System.out.println(lhs);
	}

	}

