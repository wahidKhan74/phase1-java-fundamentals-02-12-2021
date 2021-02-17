package com.simplilearn.accessmodifiers;

public class PrivateAccModifierTest {

	public static void main(String[] args) {
		
		// create object
		Father father = new Father();
		
		father.showMoney();
		
//		father.showBalance();  // Compile time error.
//		father.bankMoney;  // Compile time error.
//		father.fixDeposit; // Compile time error.

	}

}

class Father {
	
	// private variable  :: data members
	private double bankMoney = 3763454;
	private double fixDeposit= 123343545;
	
	// private method  :: member function
	private double showBalance() {
		return bankMoney;
	}
	
	// public method
	public double showMoney() {
		System.out.println("Money ::  "+ bankMoney);
		return bankMoney;
	}
	
	// zero arg  default constructor
	//	private Father(){ }
	// Note : Private Constructor based class can not be instantiated.
	// public Father(){ }
}
