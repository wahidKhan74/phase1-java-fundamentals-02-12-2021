package com.simplilearn.datastructure.linkedlist;

import java.util.LinkedList;

public class EmployeeLinkedListDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "John Smith", 234545.34);
		Employee employee2 = new Employee(102, "Marry Smith", 934545.34);
		Employee employee3 = new Employee(103, "Will Clark", 434545.34);
		Employee employee4 = new Employee(104, "Tony Stark", 334545.34);
		Employee employee5 = new Employee(105, "Will Smith", 134545.34);
		Employee employee6 = new Employee(106, "Sachin", 134545.34);
		
		LinkedList<Employee> employees = new LinkedList<Employee>();
		
		employees.add(employee1);
		employees.add(employee2);		
		employees.add(employee3);
		
		// add element in start
		employees.addFirst(employee4);
		
		// add element in last
		employees.addLast(employee5);
		
		// add at a index
		employees.add(2, employee6);
		
		// remove element
		employees.removeFirst();
		employees.removeLast();
		
		System.out.println("Head => ");
		for(Employee emp : employees) {
			System.out.println("Emp Id : "+ emp.id + " with name : "+emp.name 
					+" with salary :"+emp.salary);
			System.out.println("<=>");
		}
		System.out.println(" <= Tail ");
	}

}
