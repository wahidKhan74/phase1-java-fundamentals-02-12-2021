package com.simplilearn.exception.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.simplilearn.exception.bank.exception.AccountNotFoundEx;
import com.simplilearn.exception.bank.exception.TransactionException;

public class BankOperations {

	public static void main(String[] args) {

		// bank account list
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(101, "Spider Man", 13243.34));
		accounts.add(new Account(102, "Captain America", 73243.34));
		accounts.add(new Account(103, "Iron Man", 53243.34));
		accounts.add(new Account(104, "Thanos", 234233443.34));

		// user interaction with console
		Scanner input = new Scanner(System.in);

		System.out.println("-------------------------");
		System.out.println(":: Welcome to Hero Bank ::");
		System.out.println("-------------------------");
		System.out.println(":: Enter Your Account No. ::");
		int account = input.nextInt();		
		System.out.println(":: Choose 1. show balance or 2. deposit ::");
		
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			showBalance(account, accounts);
			break;
		case 2:
			System.out.println(":: Enter Deposit Ammount. ::");
			int amt = input.nextInt();
			depositAmount(account, accounts,amt);
			break;
		default:
			break;
		}
		
	}

	// show balance
	public static void showBalance(int accountNo, List<Account> accounts) {

		try {
			int count = 0;
			for (Account acc : accounts) {
				if (acc.accNo == accountNo) {
					System.out.println("The Account '" + acc.accNo + "' user '" + acc.name + "' has Balance Amount is "
							+ acc.balance);
					count++;
				}
			}
			if (count == 0) {
				throw new AccountNotFoundEx("Account Does not Exist with No. " + accountNo);
			}

		} catch (AccountNotFoundEx e) {
			System.out.println("Failed to load account balance for " + accountNo);
			System.out.println(e.toString());
		}
		System.out.println("End of Trsaction !");
	}

	// deposit amount
	public static void depositAmount(int accountNo, List<Account> accounts, double depositAmount) {

		try {
			int count = 0;
			for (Account acc : accounts) {
				if (acc.accNo == accountNo) {
					System.out.println("Before :: The Account '" + acc.accNo + "' user '" + acc.name + "' has Balance Amount is "
							+ acc.balance);
					// deposit
					if(depositAmount<=0 || depositAmount> 1000000) {
						throw new TransactionException("Invalid Deposit Amount min=1 and max= 1000000","400");
					}
					acc.balance = acc.balance +depositAmount;
					System.out.println("After :: The Account '" + acc.accNo + "' user '" + acc.name + "' has Balance Amount is "
							+ acc.balance);
					count++;
				}
			}
			if (count == 0) {
				throw new AccountNotFoundEx("Account Does not Exist with No. " + accountNo);
			}

		} catch (AccountNotFoundEx e) {
			System.out.println("Failed to execute Transaction " + accountNo);
		} catch (TransactionException e) {
			System.out.println("Failed to execute Transaction " + accountNo);
			e.printError();
		}
		System.out.println("End of Trsaction !");
	}

	// withdraw amount
	// TODO : withdraw amount
}
