package InterviewQuestions;

public class SwapTwoNumbers {

	public static void SwapwithoutThirdVariable(int first, int second)
	{
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("After Swapping " + "First " + first + "Second " + second); 
		
	}
	
	public static void SwapwithThirdVariable(int first, int second)
	{
		int temp;
		temp = first;
		first = second;
		second = temp;
		
		System.out.println("After Swapping " + "First " + first + "Second " + second); 
	}
	
	public static void main(String[] args) {
		int first = 20;
		int second = 50;
		System.out.println("Before Swapping " + "First " + first + "Second " + second);
		SwapwithoutThirdVariable(first, second);
		//SwapwithThirdVariable(first, second);
	}

}
