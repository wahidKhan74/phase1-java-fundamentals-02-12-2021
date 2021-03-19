package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] inputs = { 20, 35 , -11 , 7 , 65 , 1, -22};
		
		System.out.println("Before :- "+ Arrays.toString(inputs));
		inserSort(inputs);
		System.out.println("After :- "+ Arrays.toString(inputs));
		

	}
	
	public static void inserSort(int[] inputs) {
		for(int firstUnsortedIndex=1; firstUnsortedIndex < inputs.length; firstUnsortedIndex++) {
			
			 int element = inputs[firstUnsortedIndex];  
			 int i; 
			 for (i = firstUnsortedIndex; i > 0 && inputs[i-1] > element; i--) {
				inputs[i] = inputs[i-1];
			}
			 inputs[i] = element;
		}		
	}

}
