package com.xworkz.Exception.exception_checked;

public class AtmMachineTest {
	public static void main(String[] args) {
		AtmMachine am=new AtmMachine();
		int amount =500000;
		try {
			am.draw(amount);
		} catch (Exception e) {
			if(amount > 50000) {
				System.out.println(e);
				
			}
			else {
				System.out.println(e.getMessage());
			}

		}
	}

}
