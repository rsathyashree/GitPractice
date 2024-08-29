package InterviewQuestions;

public class PrintPattern {

	public static void main(String[] args) {
		int number = 5;
		int row, column;
		
		for (row=0; row<number; row++)
		{
			for(column =0; column<=row; column++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		/*for (row=0; row<number; row++)
		{
			for(column = number; column>=row; column--)
			{
				System.out.print(" "); 
			}
			for(column =0; column<=row; column++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}*/
		
		
	}

}
