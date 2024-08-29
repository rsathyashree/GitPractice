package com.Firstjavaproject;

public class SumofDigits {
	
	static int sum(int num1, int num2)
	{
		return num1+num2;
	}
	static int sum(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	static double sum(double num1, double num2)
	{
		return num1+num2;
	}
	
	public static void main(String[] args) {
		
		int sum1 = sum(20,30);
		System.out.println("Sum of two digits " + sum1);
		int sum2 = sum(100, 34);
		System.out.println("Sum of two digits " + sum2);
		
		int sum3 = sum(100,134, 567);
		System.out.println("Sum of digits " + sum3);
		double sum4 = sum(87, 45);
		System.out.println("Sum of two digits " + sum4);
	}

}
