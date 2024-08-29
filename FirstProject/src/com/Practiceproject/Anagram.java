package com.Practiceproject;

import java.util.Arrays;

public class Anagram {
	
	private static Boolean IsAnagram(String str1, String str2) {
		if (str1.length()!= str2.length())	
		{
			return false;
			
		}
		else
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
		}
		
			
	}


	public static void main(String[] args) {
		String str1 = "entsil";
		String str2 = "silent";
		
		//Boolean isanagram = IsAnagram(str1, str2);
		System.out.println("String is Anagram " + IsAnagram(str1, str2));
	}

	
}
