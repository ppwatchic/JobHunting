package Algorithms;

public class Permutation4String {

	public static void permutation(String str) {
		permutation("", str);
	}
	
	private static void permutation(String pre, String str) {
		if(str.length() == 1)
			System.out.println(pre + str);
		else {
			for(int i = 0; i < str.length(); i++)
				permutation(pre + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
		}
		
	}
	
	public static void main(String[] args) {
		permutation("Chic");
	}
}
