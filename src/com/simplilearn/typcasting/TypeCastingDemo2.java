package com.simplilearn.typcasting;

public class TypeCastingDemo2 {

	public static void main(String[] args) {
		
		/**
		 * Narrowing :-  Convert data from higher range to lower range value. 
		 * double -> float -> long -> int -> short -> byte.
		 */
	
		
		double decimalCount = 110.77d;
		
		long bigCount = (long) decimalCount;  // double to long conv.
		
		int intCount = (int) bigCount;
		
		short shortCount = (short) intCount;
		
		byte byteCount = (byte) decimalCount;
		
		System.out.println("Double value :: "+decimalCount);
		System.out.println("Long value :: "+bigCount);
		System.out.println("Integer value :: "+intCount);
		System.out.println("Short  value :: "+shortCount);
		System.out.println("Byte value :: "+byteCount);
	}

}
