package com.Practiceproject;

public class DivideString {

	public static void main(String[] args) {
		String str = "abcdefghi";

		 int n = 3;

		 int len = str.length();

		 int partLength = len / n;
		 
		 System.out.println(len);
		 System.out.println(partLength);

		 int extraChars = len % n;
		 System.out.println("extraChars" + extraChars);


		 int start = 0;

		 for (int i = 0; i < n; i++) {

		 int end = start + partLength + (i < extraChars ? 1 : 0);
		 
		 System.out.println("start" + start);
		 System.out.println("end" + end);

		 String part = str.substring(start, end);

		 System.out.println("Part " + (i + 1) + ": " + part);

		 start = end;

		 }

		 }

		}