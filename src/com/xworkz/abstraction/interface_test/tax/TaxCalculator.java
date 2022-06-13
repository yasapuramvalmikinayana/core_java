package com.xworkz.abstraction.interface_test.tax;

public class TaxCalculator implements CentralTax,StateTax {

	@Override
	public void state() {
		// TODO Auto-generated method stub
		System.out.println("state tax is 500RS");
	}
	
	@Override
	public void Central() {
		// TODO Auto-generated method stub
		System.out.println("central tax is 500RS");
		
		
	}
		
	 


}
