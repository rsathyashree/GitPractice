package InterviewQuestions;

public class StringReverse {

	public void ReverseusingStringBuffer(String str) {

		StringBuffer sb = new StringBuffer();
		sb.append(str);

		System.out.println("Reversed String is " + sb.reverse());

	}
	public String ReverseusingLoop(String str) {
		String reverse = " ";
		char[] ch = str.toCharArray();

		for(char c: ch)
		{
			reverse = c + reverse;
		}
		return reverse;
	}

	public void ReverseusingStringBuilder(String str) {

		StringBuilder sb = new StringBuilder();
		sb.append(str);

		System.out.println("Reversed String is " + sb.reverse());

	}
	public static void main(String[] args) {
		String str = "HELLO";
		System.out.println("Original String " + str);
		StringReverse sr = new StringReverse();
		sr.ReverseusingStringBuffer(str);
		System.out.println("Reversed String is " + sr.ReverseusingLoop(str));
		sr.ReverseusingStringBuilder(str);

	}
}

