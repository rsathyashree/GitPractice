package InterviewQuestions;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		
		String str = "SATHYASHREE";
		char[] ch = str.toCharArray();
		int count =0;
		
		for(char c: ch)
		{
			count++;
		}

		System.out.println(count);
	}

}
