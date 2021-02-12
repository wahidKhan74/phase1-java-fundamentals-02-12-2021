package com.simplilearn.typcasting;

public class StringToNumberConvertor {

	public static void main(String[] args) {
		
		// String to Numeric Conversion : The String value should be a convertible value.
		
		String price = "124"; // convertible value
		String amount = "1261";  // non-convertible value
		
		//convert to float
		float priceAmount = Float.parseFloat(price);
		
		// convert to double
		double doubleAmount = Double.parseDouble(amount);
		
		// convert to int
		int priceInt = Integer.parseInt(price);
		
		System.out.println("Floating Price :: "+priceAmount);
		System.out.println("Double Amount :: "+doubleAmount);
		System.out.println("Integer Price :: "+priceInt);
		
		

	}

}
