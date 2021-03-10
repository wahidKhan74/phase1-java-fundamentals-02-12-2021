package com.simplilearn.datastructure.linkedlist.doublylinkedlist;


public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "John Smith", 234545.34);
		Employee employee2 = new Employee(102, "Marry Smith", 934545.34);
		Employee employee3 = new Employee(103, "Will Clark", 434545.34);
		Employee employee4 = new Employee(104, "Tony Stark", 334545.34);
		Employee employee5 = new Employee(105, "Will Smith", 134545.34);
		Employee employee6 = new Employee(106, "Sachin", 134545.34);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		System.out.println("List size :: " + list.getSize());
		System.out.println("Is Empty list :: " + list.isEmpty());
		
		list.addToFront(employee1);
		list.addToFront(employee2);
		
		list.addToEnd(employee3);
		list.addToEnd(employee4);
		
		list.addToFront(employee5);
		list.addToEnd(employee6);
		
		System.out.println("List size :: " + list.getSize());
		System.out.println("Is Empty list :: " + list.isEmpty());
		list.prinList();
		
		System.out.println("-------------------");
		///remove element
		list.removeFromFront();	
		list.removeFromEnd();	
		list.prinList();
		

	}

}
