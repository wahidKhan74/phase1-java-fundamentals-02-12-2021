package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionDemo {

	public static void main(String[] args) {
		
		// Queue  is a data structure which works in first in first out order.
		
		// Queue : Priority Queue :: Does not order element FIFO
		
		Queue<String> bankQueue =new PriorityQueue<String>();
		
		bankQueue.add("John");
		bankQueue.add("Mike");
		bankQueue.add("William");
		bankQueue.add("Vijay");		
		bankQueue.add("Madhu");
		
		// peek an element only print HEAD 
		System.out.println("Head  :->  " + bankQueue.peek());
		System.out.println("Head  :->  " + bankQueue.element());
		
		// poll -> print element and remove element from queue
//		System.out.println("Head  :->  " + bankQueue.poll());
		
		//Iteration over queue
		
		for(String n : bankQueue) {
			System.out.println(n);
		}
		
		ArrayDeque<String> queuFiles =new ArrayDeque<String>();
		queuFiles.addFirst("File 1");
		queuFiles.add("File 2");
		queuFiles.add("File 3");
		queuFiles.add("File 4");
		queuFiles.addLast("File 1");
		
		for(String f : queuFiles) {
			System.out.println(f);
		}
	}

}
