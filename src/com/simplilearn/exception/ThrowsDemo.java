package com.simplilearn.exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// throws : used to declare an exception
		try {
			ageValidator(15);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ageValidator(int age) throws IOException,Exception {

		if (age > 18) {
			System.out.println("Your Age is valid age :: Welcome onboard !");
		} else if(age>90){
			throw new IOException("Not valid age");
		} else {
			throw new Exception("Not valid age");
		}

	}
}
