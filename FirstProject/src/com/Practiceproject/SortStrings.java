package com.Practiceproject;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
	String[] str = {"Zambia", "Apple", "Banana", "Mango", "Yam"}; 
		
		//int[] count = {10,20,3,1,44};
	
	Arrays.sort(str);

	for(String s: str)
	{
		System.out.println(s);
	}
	
	}

}
