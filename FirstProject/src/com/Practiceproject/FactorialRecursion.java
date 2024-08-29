package com.Practiceproject;

public class FactorialRecursion {
	
	public static int factorial(int number)
	{
		if (number==0)
			return 1;
			else {
				int fact = number * factorial(number-1);
				return fact;
			}
		
	}
	
	public static void main(String args[])
	{
		int number = 6;
		System.out.println("Factorial of " +number+ " is " + factorial(number));
	}

}
