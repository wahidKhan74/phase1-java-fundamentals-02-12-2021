package com.simplilearn.datastructure.bigO;

public class QuadraticeTimeComplexity {

	public static void main(String[] args) {

		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // fix size(static) array with size 10;
		displayAllPairs(items);
	}

	// This method run in O(n * n) -> O(n^2) -> Quadratic Time Complexity
	private static void displayAllPairs(int[] items) {
		for (int first : items) {
			for (int second : items) {
				System.out.println(first + " " + second);
			}
		}
	}

	// This method run in O(n * n * n) -> O(n^3) -> Exponential / Quadratic Time Complexity
	private static void displayAllPairsThrice(int[] items) {
		for (int first : items) {
			for (int second : items) {
				System.out.println(first + " " + second);				
				for (int third : items) {
					System.out.println(first + " " + second +" "+ third);
				}
			}
		}
	}
}
