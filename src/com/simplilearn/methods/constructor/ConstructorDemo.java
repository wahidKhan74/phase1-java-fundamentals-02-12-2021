package com.simplilearn.methods.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Employee employee  = new Employee();
		employee.id = 1011;
		employee.name ="John Smith";
		
		System.out.println("Employee Id :: "+employee.id);
		System.out.println("Employee Name :: "+employee.name);
		System.out.println("------------------------------------");
		
		// create employee with id
		Employee employee2  = new Employee(1012);
		System.out.println("Employee Id :: "+employee2.id);
		System.out.println("Employee Name :: "+employee2.name);
		
		System.out.println("------------------------------------");		
		// create employee with id
		Employee employee3  = new Employee("Iron Man");
		System.out.println("Employee Id :: "+employee3.id);
		System.out.println("Employee Name :: "+employee3.name);
		
		System.out.println("------------------------------------");		
		// create employee with id
		Employee employee4  = new Employee(1014,"Bat Man");
		System.out.println("Employee Id :: "+employee4.id);
		System.out.println("Employee Name :: "+employee4.name);
		System.out.println("Employee Dept :: "+employee4.dept);
	}

}


class Employee {
	
	int id;
	String name;
	String dept;
	
	// zero args / no params / default constructor
	Employee(){ }
	
	// Parameterized constructor 
	Employee(int id){
		this.id = id;
	}
	
	Employee(String name){
		this.name= name;
	}
	
	Employee(int id, String name){
		this.id= id;
		this.name = name;
		this.dept = "Engineering";
	}
	// this -> this keyword refers to the current object in method or custructor.
}