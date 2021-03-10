package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayRotationsTest {

	public static void main(String[] args) {
		int[] items = { 1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Before Rotation ");
		System.out.println(Arrays.toString(items));
		
		
		System.out.println("After Rotation ");
		ArrayRotation rotation = new ArrayRotation();
//		rotation.rotateRight(items, 2);
//		System.out.println(Arrays.toString(items));
		
		rotation.rotateLeft(items, 2);
		System.out.println(Arrays.toString(items));
	}
}


class ArrayRotation {
	
	public void rotateRight(int[] items, int pos) {

		if(pos> items.length)
			pos = pos % items.length;
		
		int[] result = new int[items.length];
		
		
		for (int i = 0; i < pos; i++) {
			result[i] = items[items.length - pos +i];
		}
		
		int j=0;
		for (int i = pos; i < items.length; i++) {
			result[i]  = items[j];
			j++;
		}
		System.arraycopy(result, 0, items, 0, items.length);
	}
	
	public void rotateLeft(int[] items, int pos) {
		
		// create temp array
		int temp[] = new int[pos];
		
		//copy first pos elements
		for (int i = 0; i < pos; i++) {
			temp[i] = items[i];
		}
		
		// move rest of the elements towards left side
		for (int i = pos; i < items.length; i++) {
			items[i-pos] = items[i];
		}
		
		// copy the temp element
		for (int i = 0; i < pos; i++) {
			items[i+items.length-pos] = temp[i];
		}
	}
}