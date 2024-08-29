package com.Programspractice;

public class Vardeclaration {
	
	public static int factorial(int number)
    {
	    int fact;
        if(number==0)
        return 1;
        else
        {
            fact = number * factorial(number-1);
            return fact;
        }
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
        //System.out.println(fact);
        		
    }

}
