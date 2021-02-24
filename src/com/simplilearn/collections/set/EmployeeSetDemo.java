package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee(101,"John Smith",347545,"Engineering");
		Employee emp2 =  new Employee(102,"Marry Smith",43545,"Software");
		Employee emp3 =  new Employee(103,"David Smith",947545,"HR");
		Employee emp4 =  new Employee(104,"Bob Smith",777545,"Operations");
		Employee emp5 =  new Employee(105,"Anand Smith",987545,"Sales");
		
		Set<Employee> setOfEmployees = new HashSet<Employee>();
		
		setOfEmployees.add(emp1);
		setOfEmployees.add(emp2);
		setOfEmployees.add(emp3);
		setOfEmployees.add(emp4);
				
		System.out.println(setOfEmployees);
		
		// List Traversing 
		for(Employee emp : setOfEmployees) {
			System.out.println("Employee :: " + emp.id  +" , "+emp.name 
					+" , "+emp.salary +" , "+emp.dept);
		}

	}

}
