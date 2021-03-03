package com.simplilearn.exception.bank.exception;

public class TransactionException extends Exception{

	String message;
	String status;
	
	public TransactionException(String message,String status) {
		this.status = status;
		this.message = message;
	}
	
	public void printError() {
		System.out.println("Exception Occurs with : " + status +" message : "+message);
	}
		
}
