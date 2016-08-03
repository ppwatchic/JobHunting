package Algorithms;

public class Palindrome {
	
	public static boolean palindrome(String str) {
		if(str==null || str.length()==1)
			return true;
		
		int i = 0, j = str.length() - 1;
		while(i < j) 
			if(str.charAt(i++) != str.charAt(j--))
				return false;
		return true;		
	}

	public static void main(String[] args) {
		System.out.println(palindrome("mtatm"));
	}
}
