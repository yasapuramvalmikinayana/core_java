package com.xworkz.abstraction.interface_test.atm;

public class AtmImplementation implements AtmMachineworks, ATMWithdraw {

	@Override
	public void machineworks() {
		System.out.println("mechin work correctly");
	}

	public void withdraw() {
		System.out.println("you can withdraw money");
	}

}
