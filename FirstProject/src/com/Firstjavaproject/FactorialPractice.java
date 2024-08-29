package com.Firstjavaproject;

public class FactorialPractice {

	public static int Factorial(int n)
	{
		if(n==0)
			return 1;
		else		
		return (n * Factorial(n-1));
	}
	
	public static void main(String[] args) {
		int number = 5;
		int fact=1;
		fact = Factorial(number);
		System.out.println(fact);

}
}