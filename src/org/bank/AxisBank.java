package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposit %10");
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
	}
	
}
