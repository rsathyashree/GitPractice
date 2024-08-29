package com.Programspractice;

public class StringReverse {
	public static void main(String[] args) {
	 //Reverse a string
    String str = "HELLO";
    String reverse ="";
    char[] ch = str.toCharArray();
    
    for(char c: ch)
    {
        reverse = c + reverse;
        
    }
    
    System.out.println(reverse);
}

}
