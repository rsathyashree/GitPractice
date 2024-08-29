package com.Practiceproject;

import java.util.Arrays;

public class IntBubbleSort {
	
	public static void main (String[] args)

	{

	int[] arr = {45, 12, 67, 8, 3};
	int n= arr.length;
	//System.out.println(n);

	for (int i=0; i<n; i++)
	{
		for (int j=0; j<n-i-1; j++)
		
		{
		if(arr[j]  > arr[j+1])
		 {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		 }
		}
		
	}



	//System.out.println(Arrays.toString(arr));
	
	for(int i: arr)
	{
		System.out.println(i);
	}


	}
	

}
