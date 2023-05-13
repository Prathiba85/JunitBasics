package code;

public class String_functions {
	
	public static boolean palindrome(String str)
	{
		String result="";
		boolean flag=false;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}

		if (str.equalsIgnoreCase(result)) {
			flag=true;
		}
		
		return flag;

		
	}

}
