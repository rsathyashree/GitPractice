package com.Programspractice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "madam";
		char[] ch = str.toCharArray();
		String reverse = "";
		
		for(char c: ch)
			
		{
			//System.out.println(c);
			reverse = c + reverse;
		}
		System.out.println(reverse);
		
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("text is palindrome");
		}
		else
		{
			System.out.println("text is not palindrome");
		}
		
		
	}

}
