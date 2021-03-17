package com.simplilearn.datastructure.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] inputs  = { 20 ,50 , 35, -15, 7 ,1, 55 , -22 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");		
		int value = sc.nextInt();

		// if element present in the array return position or else return -1.
		int searchIndex =  linearSearch(inputs,value);
		if(searchIndex >= 0 )
			System.out.println("The Search Element : "+ value +" is found at position : "+(searchIndex+1));
		else
			System.out.println("The Search Element : "+ value +" is not found in the list !");
	}

	public static int linearSearch(int[] input, int value) {
		
		// search through an complete array
		for (int index = 0; index < input.length; index++) {
			if(input[index]==value) {
				return index;
			}
		}
		return -1;
	}
}
