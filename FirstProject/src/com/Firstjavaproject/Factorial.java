package com.Firstjavaproject;
import java.util.*;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println("Enter the number you want to find Factorial");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int i; 
		long fact=1;
		scanner.close();
		if(number>0)
		{
		
		for(i=1; i<=number; i++)
		{
			System.out.println(i);
				fact = fact*i;	
		}
		System.out.println("Factorial of " + number + "\tis " +  fact);
		}
		else
		System.out.println("Enter valid number");
	}

}
