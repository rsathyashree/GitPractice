package com.Practiceproject;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		//str = str.toLowerCase();
		
		String rev = " ";
		
		
		for (int i=0; i<str.length(); i++)
		{
			char nstr = str.charAt(i);
			rev = nstr + rev;
		}
		rev = rev.trim();
		
		
		if(str.equals(rev))
		{
			System.out.println("Text is palindrome");
		}
		else
			System.out.println("Text is not palindrome");
}
	
}