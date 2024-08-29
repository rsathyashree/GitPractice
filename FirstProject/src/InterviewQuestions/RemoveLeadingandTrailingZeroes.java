package InterviewQuestions;

public class RemoveLeadingandTrailingZeroes {

	public static void main(String[] args) {
		String str = " Java Programming ";
		
		System.out.println("Original String " + str);
		System.out.println(str.strip());
		System.out.println(str.trim());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		
		
	}

}
