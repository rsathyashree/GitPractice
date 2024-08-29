package com.Firstjavaproject;
import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String args[])
	{
		int option = 1;
		System.out.println("Welcome!");
		while(option==1)
		{
		
		System.out.println("Enter the First Number:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		System.out.println("Enter the Second Number:");	
		int j = scanner.nextInt();
		
		System.out.println ("Select the operation to be performed: A for Addition, S for Subtraction");
		String opern = scanner.next();
		
			if(opern.equals("A"))
				{
				System.out.println("Result is " + (i+j));
				}
			else if(opern.equals("S"))
				{
				System.out.println("Result is " + (i-j));
				}
			else 
				{
				System.out.println("Invalid operation entered");
				}
		
		System.out.println("Enter 1 to continue or 0 to exit");
		option = scanner.nextInt();
	}
		System.out.println("Thank you!");
	}

}
