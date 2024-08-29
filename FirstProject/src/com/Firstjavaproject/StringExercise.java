package com.Firstjavaproject;

public class StringExercise {

	public static void main(String[] args) {
		String str = "This is lot of text again";
		int n = str.length();
		
		
		for (int i=0; i<n; i++)
		{
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

}
