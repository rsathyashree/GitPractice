package com.Programspractice;

public class SwapTwoVariables {
	
	
	public static void swapWithThirdVariable(int a, int b)
	{
		int c= a + b;
		a = c - a;
		b = c - b;
		
		System.out.println("New value for a is " + a + " and b is " +  b);
		
	}
	
	public static void swapWithoutThirdVariable(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("New value for a is " + a + " and b is " +  b);
	}

	public static void main(String[] args) {
		int a = 10;
		int b=5;
		System.out.println("Original value of a " + a);
		System.out.println("Original value of b " + b);
		
		//swapWithThirdVariable(a,b);
		
		swapWithoutThirdVariable(a,b);

	}

		
}
