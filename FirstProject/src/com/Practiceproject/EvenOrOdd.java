package com.Practiceproject;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("Number is even");
			
		}
		else
			System.out.println("Number is odd");

	}

}
