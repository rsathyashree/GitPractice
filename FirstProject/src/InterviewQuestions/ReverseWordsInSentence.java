package InterviewQuestions;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String str = "I like Java programming";
		
		String[] strArray = str.split(" ");
		
		String reverse = " ";
		
		for(String words: strArray)
		{
			reverse = words + " " + reverse ;
		}
		
		System.out.println(reverse);
	}

}
