package InterviewQuestions;

public class FindNumberOfVowels {

	public static void main(String[] args) {
		String input = "Sathya";
		
		int vowelCount = 0;
		
		input = input.toLowerCase();
		
		int length = input.length();
		
		for(int i=0; i<length; i++)
		{
			char ch = input.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				vowelCount++;
			}
		}
		
		System.out.println("Number of Vowels present in " + input + " is " + vowelCount);
	}

}
