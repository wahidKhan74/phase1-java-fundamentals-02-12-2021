package com.simplilearn.datastructure.bigO;

public class LinearTimeComplexity {

	public static void main(String[] args) {
		
		int [] items = { 1, 2,3,4,5,6,7,8,9,10 };  //fix size(static) array with size 10;

		displayAll(items);
	}
	
	// This method runs in  O(n) time complexity  -> Linear Time Complexity
	public static void displayAll(int [] itmes) {
		for (int item : itmes) {
			System.out.println(item);
		}
	}
}
