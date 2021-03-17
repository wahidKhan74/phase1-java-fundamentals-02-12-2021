package com.simplilearn.datastructure.search;

public class BinarySearchWithRecursiveCall {

	public static void main(String[] args) {

		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };
		int value = -3;
		
		int start = 0;
		int end  = inputs.length-1;
		
		int searchIndex = recursiveSearch(inputs,start,end, value);
		System.out.println("The Element : " + value + " is found at position : " + searchIndex);
	}

	public static int recursiveSearch(int[] inputs,int start , int end, int value) {
		// breaking condition -> if value not found
		if(start>end) {
			return -1;
		}
		
		int middpoint = (start + end)/2;
		System.out.println("-----------------");
		System.out.println("start : "+start);
		System.out.println("end  : "+end);
		System.out.println("Middpoint : " + middpoint);
		
	
		// midd value is the search 
		if(inputs[middpoint]== value) {
			return middpoint;
		}
		
		// search in right half
		else if (inputs[middpoint] < value) {
			return recursiveSearch(inputs, middpoint+1, end,value );
		}
		
		// search in left half
		else {
			return recursiveSearch(inputs, start, middpoint-1,value );
		}
		
	}

}
