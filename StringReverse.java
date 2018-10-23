//package activity14;
//ways to reverse a String
public class StringReverse {

	public static void main(String[] args) {
   
		String phrase = "       Four score and seven years ago";
		String trimPhrase = phrase.trim();
		reverseString(phrase);
		reverseByChars(phrase);
		System.out.println();
		char[] testPhrase = phrase.toCharArray();
		for(int i = 0; i < testPhrase.length; i++)
				System.out.print(testPhrase[i]);
		System.out.println();
		System.out.println(trimPhrase);
	}
	
	public static String reverseString(String str)
	{
		StringBuilder sb = new StringBuilder();
		String returnPhrase = " ";
	
		
		String[] splitPhrase = str.split( "\\s+");
		for(int i = splitPhrase.length - 1; i >= 0; i--)
		{
			sb.append(splitPhrase[i] + " ");
		}
		
		System.out.print(sb);
		
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < splitPhrase.length; i++)
		{
			sb2.insert(0, splitPhrase[i] + " ");
		}
		
		System.out.println(sb2);
		
		return returnPhrase;
	}

	public static void reverseByChars(String phrase)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < phrase.length(); i++)
		{
			sb.insert(0, phrase.charAt(i));
		
		}
		System.out.print(sb);
	}
}
