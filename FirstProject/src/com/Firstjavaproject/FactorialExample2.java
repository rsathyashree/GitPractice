package com.Firstjavaproject;

public class FactorialExample2 {
	
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}

	public static void main(String[] args) {
		int fact =1;
		int number = 0;
		
		fact = factorial(number);
		System.out.println(fact);
	}

}
