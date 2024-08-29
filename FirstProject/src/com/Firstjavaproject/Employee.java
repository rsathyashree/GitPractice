package com.Firstjavaproject;

public class Employee {
	
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	 void displaySalary()
	{
		System.out.println("Employee Name:" + "\t" + name);
		System.out.println("Employee Salary:"+ salary);
	}
			
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ram", 45000);
		Employee emp2 = new Employee("Shiva", 36000);
		emp1.displaySalary();
		emp2.displaySalary();
		
		
	}

}
