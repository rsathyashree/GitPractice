package com.Firstjavaproject;
import java.util.*;

public class TwoDigit {
	
	static boolean CheckDigit(int n)
	{
		if ((n>10) && (n<99))
		return true;
		else 
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		boolean result = CheckDigit(number);
		if (result)
		{
			System.out.println("Entered number is two digit");
			
		}
		else
		System.out.println("Entered number is not two digit");
	}
	

}
