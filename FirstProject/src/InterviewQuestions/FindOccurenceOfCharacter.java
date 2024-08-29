package InterviewQuestions;

public class FindOccurenceOfCharacter {
	
	public static void usingIteration(String str, char ch)
	{
		int occurence = 0;
		char[] charArray = str.toCharArray();
		
		for (char element: charArray)
		{
			if(element == ch)
			{
				occurence++;
			}
		}
	System.out.println("Number of times" + " " + ch + " occurs in the input is " + occurence);
	}
	
	public static void withoutIteration(String str, char ch)
	{
		String newString = Character.toString(ch).toLowerCase();
		
		int origLength = str.length();
		str = str.replace(newString, "");
		System.out.println(str);
		int replacedLength = str.length();
		System.out.println(replacedLength);
		int occurence = origLength - replacedLength;
		
		System.out.println(occurence);
	}

	public static void main(String[] args) {
		String input = "Sathyashree";
		char toFind = 's';
		
		input = input.toLowerCase();
		//System.out.println(input);
		//usingIteration(input, toFind);
		
		withoutIteration(input, toFind);

	}

}
