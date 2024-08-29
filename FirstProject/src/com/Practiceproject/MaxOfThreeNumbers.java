package com.Practiceproject;
import java.util.*;

public class MaxOfThreeNumbers {
	int number1;
	int number2;
	int number3;
	
	MaxOfThreeNumbers(int number1, int number2, int number3)
	{
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	
	int max()
	{
		if((number1>=number2) && (number1>=number3))
				return number1;
		if((number2>=number1) && (number2>=number3))
			 return number2;
			 else
				 return number3;
		
		
	}

	public static void main(String[] args) {
		
					
		MaxOfThreeNumbers max = new MaxOfThreeNumbers(441,433,1665);
		System.out.println("Maximum of three numbers is " + max.max());
		
		
	}
	
	/*public static void main(String[] args) {

		int number1;
		int number2;
		int number3;
		
		System.out.println("Enter the First number");
		Scanner scanner = new Scanner(System.in);
		number1 = scanner.nextInt();

		System.out.println("Enter the Second number");
		number2 = scanner.nextInt();
		
		System.out.println("Enter the Third number");
		number3 =scanner.nextInt();
		
		if((number1>number2) && (number1>number3))
		System.out.println("Number " + number1 + " is the maximum");
		
		else if((number2>number1) && (number2>number3))
		System.out.println("Number " + number2 + " is the maximum");
		
		else
		System.out.println("Number " + number3 + " is the maximum");*/
}

