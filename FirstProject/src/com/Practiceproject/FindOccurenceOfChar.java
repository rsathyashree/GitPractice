package com.Practiceproject;

public class FindOccurenceOfChar {

	public static void main(String[] args) {
		
		String str = "HELLHO";
		char c = 'H';
		int count =0;
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
