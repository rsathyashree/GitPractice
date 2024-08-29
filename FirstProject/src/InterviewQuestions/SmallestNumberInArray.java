package InterviewQuestions;

import java.util.Arrays;

public class SmallestNumberInArray {

	int array[] = {56,34,98,12,89};

	public void smallestinarray()
	{

		int smallest = Integer.MAX_VALUE;
		//int smallest = array[0];
		//System.out.println(smallest);

		for(int i=0; i<array.length; i++) 
		{
			if(array[i] < smallest)
			{
				smallest = array[i];
			}
		}

		System.out.println(smallest);
	}

	public void usingArraySort()
	{
		//int array[] = {56,34,98,12,89};
		Arrays.sort(array);

		int smallest = array[0];
		System.out.println(smallest);

	}
	
	public void usingCollections()
	{
		
	}

	public static void main(String[] args) {

		SmallestNumberInArray sr = new SmallestNumberInArray();
		sr.smallestinarray();
		sr.usingArraySort();
	}

}
