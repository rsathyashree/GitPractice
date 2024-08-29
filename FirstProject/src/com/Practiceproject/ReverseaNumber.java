package com.Practiceproject;

public class ReverseaNumber {

	public static void main(String[] args) {
		int number = 4325;
		int rev =0, r;
		
		while(number >0)
		{
			r = number%10;
			rev = (rev*10) + r;
			number = number/10;
		
		}
		System.out.println(rev);
	}

}
