package com.simplilearn.exception;

import java.util.prefs.BackingStoreException;

public class ExceptionWithMethods {

	public static void main(String[] args) {
		// calling method

//		transaction(20);
//		transaction(0);
//		transaction(100);
//		stringLenghtCalculator("Hello, Welcome");
//		stringLenghtCalculator(null);
//		stringLenghtCalculator("John Smith");

//		numberConvertorToInt("100");
//		numberConvertorToInt("100abc");
//		numberConvertorToInt("24345");

		multiTask("John Smith", 20); /// Number format Exception
		multiTask("1002", 0); /// Arithmetic Exception
		multiTask(null, 10); /// Arithmetic Exception

	}

	public static void transaction(int amount) {
		try {
			int balance = 20000;
			float response = balance / amount;
			System.out.println("Response ::: " + response);
		} catch (ArithmeticException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		}
	}

	public static void stringLenghtCalculator(String str) {
		try {
			int response = str.length();
			System.out.println("Response ::: " + response);
		} catch (NullPointerException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		}
	}

	public static void numberConvertorToInt(String number) {
		try {
			int response = Integer.parseInt(number);
			System.out.println("Response ::: " + response);
		} catch (NumberFormatException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		}

	}

	public static void multiTask(String str, int number) {

		try {
			int response1 = 2000 / number;
			int response2 = str.length();
			int response3 = Integer.parseInt(str);

			System.out.println("Response1 ::: " + response1);
			System.out.println("Response2 ::: " + response2);
			System.out.println("Response3 ::: " + response3);
		} catch (ArithmeticException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Exception Ocuurs :: " + e.getClass());
			System.out.println("Exception Message :: " + e.getMessage());
		}
	}

	public static void multiTask2(String str, int number) {

		try {
			int response1 = 2000 / number;
			int response2 = str.length();
			int response3 = Integer.parseInt(str);

			System.out.println("Response1 ::: " + response1);
			System.out.println("Response2 ::: " + response2);
			System.out.println("Response3 ::: " + response3);
		} finally {
		System.out.println("Always execute");
		}
	}
}
