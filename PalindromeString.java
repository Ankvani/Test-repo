
public class PalindromeString {

	public static void main(String[] args) {

		String str="Radar",reversestr="";
		
		int strlength= str.length();
		for (int i=(strlength-1);i>=0;i--)
		{
		 reversestr=reversestr+str.charAt(i);	
		}
		if(str.toLowerCase().equals(reversestr.toLowerCase()))
				{
			System.out.println(str+ "String iss palindrome");
				}
		else
		{
			System.out.println(str+ ""
					+ "String is not palindrome");
		}
	}

}
