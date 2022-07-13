package com.xworkz.Exception.exception_checked;

public class AtmMachine {

	public void draw (int amount) throws AtmException  {
		if (amount < 100 || amount > 50000|| amount % 100 != 0) {
		AtmException atmExcep = new AtmException();
		throw atmExcep;
			
		} 
		else {
			System.out.println("please collect cash....!");
			
		}

	}
}
