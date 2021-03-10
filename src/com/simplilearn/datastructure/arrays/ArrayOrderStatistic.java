package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {

		int arr[] = { 7, 10, 4, 3, 20, 15 };

		int res = findKthSmallest(arr, 3);

		System.out.println("The 3rd Smallest element is : " + res);
		
		int res2 = findKthLargest(arr, 2);

		System.out.println("The 2nd Largest element is : " + res2);


	}

	public static int findKthSmallest(int[] arr, int kathSmallest) {

		// sort array
		Arrays.sort(arr); // 3,4,7,10,15,20

		// return kth smallest element
		return arr[kathSmallest - 1];
	}

	public static int findKthLargest(int[] arr, int kathSmallest) {

		// sort array
		Arrays.sort(arr); // 3,4,7,10,15,20
		
		// return kth largest element
		return arr[arr.length - kathSmallest];
	}
}
