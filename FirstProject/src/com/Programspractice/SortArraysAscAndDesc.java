package com.Programspractice;

public class SortArraysAscAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {45, 6, 12, 7, 23, 34, 9};
		int n=arr.length-1;
		int temp =0;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j< n-i; j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
					
			}
			
			
		}
		for(int k : arr)
		{
			System.out.println(k);
		}
	}

}
