package com.Firstjavaproject;

public class ReverseStrPractice {
	
	static String reverseString(String input)
	{
	    	
		String nstr =" ";
		for (int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			//System.out.println(ch);
			nstr = ch + nstr;
		}
		//System.out.println("Reversed word " + nstr);
		return nstr;
		
	}

	public static void main(String[] args) {
		
		String str = "HELLO";
		//System.out.println(reverseString(str));
		//System.out.println("Original word " + str);
		String output = reverseString(str);
		System.out.println(output);
	}

}
