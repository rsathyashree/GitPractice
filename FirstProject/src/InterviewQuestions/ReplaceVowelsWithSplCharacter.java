package InterviewQuestions;

public class ReplaceVowelsWithSplCharacter {

	public static void main(String[] args) {
		String str = "Educatione";
		
		/*char[] charArray = str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		
		{
			char c = str.charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				charArray[i] = '*';
			}
		}
		
		for(char c: charArray)
		{
			System.out.print(c);
		}*/
		
		String str1 = str.replaceAll("[Ee]", "*");
		System.out.println(str1);
		
	}

}
