
public class MinPalindrome {
	
	public static void main(String args[])
	{
		String s = "abcda";
		System.out.println(findNumber(s));
	}

	static int findNumber(String s)
	{
		int length = s.length();
		if(length == 1 )
			return 0;
		if(length == 2)
		{
			if(s.charAt(0) == s.charAt(1))
				return 0;
			else
				return 1;
		}
		if(s.charAt(0) == s.charAt(length-1))
		{
			return findNumber(s.substring(1,length-1));
		}
		return Math.min(findNumber(s.substring(0,length-1)), findNumber(s.substring(1,length))) + 1 ;
	}
}
