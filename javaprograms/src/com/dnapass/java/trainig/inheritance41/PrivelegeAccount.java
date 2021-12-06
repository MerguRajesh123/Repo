package com.dnapass.java.trainig.inheritance41;

public class PrivelegeAccount extends Account{

	public void withdraw(double amount) {
		//accountBalance=accountBalance-a;
		super.setAccountBalance(super.getAccountBalance()-amount);
	}

}