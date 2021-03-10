package com.simplilearn.datastructure.linkedlist.siglylinkedlist;

public class EmployeeSinglyLinkedList {

	private EmployeeNode head;
	private int size;

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// add element to the front list
	public void addToFront(Employee employee) {

		EmployeeNode node = new EmployeeNode(employee);
		// set next node ref
		node.setNext(head);
		// set head as new node
		head = node;
		size++;
	}

	// remove element from the front list
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;		
		// set next node in list as head node.
		head = head.getNext();		
		size--;
		removedNode.setNext(null);		
		return removedNode;
	}
	
	public void prinList() {
		EmployeeNode current = head;
		System.out.println("Head -> ");
		while (current !=null) {
			System.out.print(current.getData());
			System.out.println(" -> ");
			current = current.getNext();
		}
		System.out.println("NULL");
	}

	
}
