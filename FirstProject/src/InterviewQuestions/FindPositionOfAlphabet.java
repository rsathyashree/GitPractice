package InterviewQuestions;

public class FindPositionOfAlphabet {

	public static void main(String[] args) {
		char alphabet = 'D';
		
		alphabet = Character.toLowerCase(alphabet);
		
		int asciiValue = (int)alphabet;
		
		int position = asciiValue -  96;
		System.out.println(position);

	}

}
