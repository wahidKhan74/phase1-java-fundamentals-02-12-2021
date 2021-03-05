package com.simplilearn.datastructure.bigO;

public class ExampleOnTimeComplexity {

	public static void main(String[] args) {

		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // fix size(static) array with size 10;

		display(items);
	}

	// This method run in O(1+n+1) -> O(n+2) -> O(n) -> Linear Time Complexity
	public static void display(int[] items) {
		System.out.println(items[0]);
		for (int item : items) {
			System.out.println(item);
		}
		System.out.println(items[4]);
	}

	// This method run in O(1+n+1+n) -> O( 2+2n) -> O(n) -> Linear Time Complexity
	public static void displayTwice(int[] items) {

		System.out.println(items[0]); // O(1)

		for (int item : items) {
			System.out.println(item);
		}

		System.out.println(items[4]);
		int index = 0;
		while (index < items.length) {
			System.out.println(items[index]);
			index++;
		}
	}

	// This method run in O(1+n+1+n/2) -> O( 2+3n/2) -> O(n) -> Linear Time Complexity
	public static void displayQuestion(int[] items) {

		System.out.println(items[0]); // O(1)

		for (int item : items) {
			System.out.println(item);
		}

		System.out.println(items[4]);
		
		int index = 0;
		int middle = items.length / 2 ;
		while (index < middle) {
			System.out.println(items[index]);
			index++;
		}
	}
}
