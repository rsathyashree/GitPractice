package com.Firstjavaproject;

public abstract class AbstractPractice {
	abstract public void display();
	
	public static class Employee extends AbstractPractice
	{
		public void display()
		{
			System.out.println("Employee print");
		}
	}
	

public static void main(String args[])
{
	Employee emp = new Employee();
	emp.display();
	
}
}