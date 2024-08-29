package com.Programspractice;
import java.util.Arrays;

public class MaxDifferenceInArray {

	public static void main(String[] args) {
		int[] arr = {1,44,8,15,17};
		int n=arr.length;
		int[] newarr = new int[n-1];
		int k =0;
		
		for(int i=0; i<n-1; i++)
		{
				if(arr[i+1] - arr[i] > k)
				{
					k = arr[i+1] - arr[i];
				}
				
			
			//newarr[i] = k;
		}
		
		System.out.println(k);
		
		//System.out.print(Arrays.toString(newarr));
		
		/*int largest = Integer.MIN_VALUE;
		
		for(int array : newarr)
		{
			if(array>largest)
			{
				largest = array;
			}
			
		}
		System.out.println("largest in the array is" + largest); */

	}

}
