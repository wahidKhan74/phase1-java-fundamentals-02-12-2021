package com.simplilearn.datastructure.search;

public class BinarySearchWithIteration {

	public static void main(String[] args) {
		
		int[] inputs = { -22 , -15 , -3, -1 , 7 ,9 ,20 , 35 , 55};
		int value = 55; 
		
		int searchIndex = iterativeSearch(inputs, value);
		System.out.println("The Element : "+ value + " is found at position : "+searchIndex) ;
	}

	private static int iterativeSearch(int[] inputs, int value) {
		int start = 0;
		int end = inputs.length-1;
		while (start <= end ) {
			System.out.println("-----------------");
			System.out.println("start : "+start);
			System.out.println("end  : "+end);
			
			int middpoint = (start + end)/2;
			System.out.println("Middpoint : " + middpoint);
			System.out.println("-----------------");
			// midd value is the search 
			if(inputs[middpoint]== value) {
				return middpoint;
			}
			
			// search in right half
			else if (inputs[middpoint] < value) {
				start = middpoint+1;
			}
			// search in left half
			else {
				System.out.println();
				end = middpoint-1;
			}
		}
		return -1;
	}

}
