package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee(101,"John Smith",347545,"Engineering");
		Employee emp2 =  new Employee(102,"Marry Smith",43545,"Software");
		Employee emp3 =  new Employee(103,"David Smith",947545,"HR");
		Employee emp4 =  new Employee(104,"Bob Smith",777545,"Operations");
		Employee emp5 =  new Employee(105,"Anand Smith",987545,"Sales");
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		
		System.out.println(listOfEmployees);
		
		// List Traversing 
		for(Employee emp : listOfEmployees) {
			System.out.println("Employee :: " + emp.id  +" , "+emp.name 
					+" , "+emp.salary +" , "+emp.dept);
		}

	}

}
