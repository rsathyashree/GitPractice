package com.Programspractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {45, 6, 12, 7, 23, 34, 9};
		int[] arr2 = {54, 6, 18, 8, 23, 33, 9};
		int n = arr1.length;
		//int[] newarr = new int[n];
		ArrayList<Integer> newarr = new ArrayList<>();
		
		for(int i=0; i<arr1.length-1; i++)
		{
			if(arr1[i]==arr2[i])
			{
				newarr.add(arr1[i]);
			}
		}
		
		
		//System.out.println(Arrays.toString(newarr));
		Object[] o = newarr.toArray();
		for(Object a: o)
		{
			System.out.print(a);
		}
		
		
		
		//System.out.println(o);

	}

}
