package com.Practiceproject;

public class CountVowelConsonant {

	public static void main(String[] args) {
		String str = "HELLO WORLD";
		int vowels = 0, consonants =0;
		
		
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		
		for (char c: ch)
		{
			if((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
			{
				vowels++;
			}
			else
				consonants++;
		}
		
		System.out.println("Number of vowels present is " + vowels);
		System.out.println("Number of consonants present is " + consonants);
}
}