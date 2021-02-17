package com.simplilearn.methods.bank;

public class BankOperation {

	public static void main(String[] args) {
		
		// create object
		Account account = new Account();
		
		account.welcomeMessage();
		
		double balance = account.showBalance();
		
		double newBalance = account.withdraw(2002324);
		
		System.out.println("Result Balance :: "+ balance);
		System.out.println("Result New Balance :: "+ newBalance);
		

	}

}
