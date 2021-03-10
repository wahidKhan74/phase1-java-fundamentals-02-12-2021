package com.simplilearn.datastructure.arrays;

public class ArrayDSTest {

	public static void main(String[] args) {
		int[] items = { 1,2,3,4,5,6,7,8,9,10};
		displayAll(items);
	}

	// iteration over array : O(n+n)  -> O(2n)  -> O(n) 
	private static void displayAll(int[] items) {
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(" The index : "+i+" and value : "+items[i]);
		}
		
		for (int item : items) {
			System.out.println(" The value : "+item);
		}
	}

}
