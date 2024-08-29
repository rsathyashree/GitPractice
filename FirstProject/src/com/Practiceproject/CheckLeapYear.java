package com.Practiceproject;
import java.time.*;

public class CheckLeapYear {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		System.out.println(date);
		//int year = 2024;
		int div = year%4;
		System.out.println(div);
		
		if(date.isLeapYear())
		{
			System.out.println("Entered year is leap year");
		}
		else
			System.out.println("Entered year is not a leap year");

	}

}
