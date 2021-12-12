package com.dnapass.java.training.Exceptions;

import java.util.List;

public class Account {
		
		private static int lastAssignedNumber=0;
		private int accountNumber;
		private double accountBalance;
		
		public Account(int accountNumber, double accountBalance) {
			this.accountNumber=accountNumber;
			this.accountBalance=accountBalance;
			
		}
		
		public Account() {
			lastAssignedNumber++;
			accountNumber=lastAssignedNumber;
		}
		
		public Account(double accountBalance) {
			this.accountBalance=accountBalance;
		}
		
		public void showData() {
			System.out.println("Account number = "+accountNumber);
			System.out.println("Account balance = "+accountBalance);
		}
		
		public void deposit(double depositAccount) {
			if(depositAccount<0) {
				
			}else {
				accountBalance=accountBalance+depositAccount;
			}
		}
		public void  withdraw(double withdrawAmount) throws InsufficientFundsException{
			if(accountBalance<withdrawAmount) {
				//throw new IllegalArgumentException("Withdraw Amount exceeds balance amount");
				throw new InsufficientFundsException("withdraw of"+ withdrawAmount+"exceeds balance of "+accountBalance, ErrorCode.ERR002);
				
				
			}
			else {
				accountBalance=accountBalance-withdrawAmount;
			}
		}
		
		public void transfer(double Amount,Account other) throws InsufficientFundsException{
			withdraw(Amount);
			other.deposit(Amount);
		}

		public static int getLastAssignedNumber() {
			return lastAssignedNumber;
		}

		public static void setLastAssignedNumber(int lastAssignedNumber) {
			Account.lastAssignedNumber = lastAssignedNumber;
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public double getAccountBalance() {
			return accountBalance;
		}

		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		
		
		
}

enum ErrorCode{
	ERR001,ERR002
}


