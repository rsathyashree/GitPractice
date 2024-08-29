package com.Firstjavaproject;

public class ReverseString {

	public static void main(String[] args) {
		String str = "IBM";
		String reverse = " ";
			
		int n = str.length();
		
		
		for (int i=0; i<str.length(); i++)
		{
		char nstr = str.charAt(i);
		reverse = 	nstr + reverse;
				}
		System.out.println(n);
		System.out.println(reverse);
	}

}
