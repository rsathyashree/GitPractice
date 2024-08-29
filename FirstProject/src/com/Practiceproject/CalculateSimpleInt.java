package com.Practiceproject;
import java.util.*;

public class CalculateSimpleInt {
	
	static double simpleInterest(int p, double i, int y)
	{
		double v= (p*i*y)/100;
		return v;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the Principal amount");
		Scanner scanner = new Scanner(System.in);
		int principal = scanner.nextInt();
		
		System.out.println("Enter the Rate of Interest");
		double interest = scanner.nextDouble();
		
		System.out.println("Enter the number of years");
		int years = scanner.nextInt();
		
		double value = simpleInterest(principal, interest, years);
		System.out.println(value);
		scanner.close();
		

	}

}
