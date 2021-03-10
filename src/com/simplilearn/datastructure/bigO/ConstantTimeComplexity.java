package com.simplilearn.datastructure.bigO;

public class ConstantTimeComplexity {

	public static void main(String[] args) {
		
		// ordered static data structure
		int[] items = { 1,2,3,4,5,6,7,8,9,10};
		
		// Note : Access any value in array with index  O(1) 
		
		displayOne(items);
		
		displayTwo(items);

	}
	// This method runs in O(1+1) -> O(2) -> O(1) -> constant time complexity 
	private static void displayTwo(int[] items) {
		System.out.println(items[0]);
		System.out.println(items[2]);
	}

	// This method Time Complexity is O(1)  -> constant Time Complexity 
	private static void displayOne(int[] items) {
		System.out.println(items[2]);
	}

	
}
