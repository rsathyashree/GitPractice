package com.Practiceproject;

import java.util.Arrays;

public class BubbleSort {
	
	public static void BubbleSort(String[] arr)
	{
		
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp = arr[j];
					
					arr[j] = arr[j+1];
				
					arr[j+1] = temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = {"Zambia", "Apple", "Banana", "Mango", "Yam"};
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
