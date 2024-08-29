package InterviewQuestions;

public class ElementPresentInArray {

	public static void main(String[] args) {
		int[] numberArray = {56, 45, 12, 89, 34, 11};
		
		int elementToFind = 11;
		
		int n= numberArray.length;
		System.out.println(n);
		
		/*System.out.println(numberArray[0]);
		System.out.println(numberArray[1]);
		System.out.println(numberArray[2]);
		System.out.println(numberArray[3]);
		System.out.println(numberArray[4]);
		System.out.println(numberArray[5]);*/
		
		boolean found = false;
		
		for(int i=0; i<n; i++)
		{
			if(numberArray[i] == elementToFind)
			{
				System.out.println(numberArray[i]);
				found = true;
			}
			}
		
		if(found)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		
	}

}
