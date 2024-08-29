package com.Practiceproject;

public class Swaptwonumberswithoutthird {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("Original value of a is " + a);
		
		System.out.println("Original value of b is " + b);
		
		a = a + b;
		b = a - b;
		
		a = a-b;
		
		System.out.println("Swapped value of a is " + a);
		
		System.out.println("Swapped value of b is " + b);

	}

}
