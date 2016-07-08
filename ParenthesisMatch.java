public class ParenthesisMatch {	
	static char[] lp = {'(','[','{'};
	static char[] rp = {')',']','}'};	

	public boolean matchParentheses(String s) {
		Stack<Character> sc = new Stack<Character>();
		
		//assume all legal input
		for(int i = 0; i < s.length(); i++) {
			if(isLeft(s.charAt(i)) == true)
				sc.push(s.charAt(i));
			else {
				int lindex = leftIndex(sc.pop());
				int rindex = rightIndex(s.charAt(i));
				if(lindex!=rindex)
					return false;					
			}				
		}		
		
		return true;
	}
	
	private int leftIndex(char c) {
		for(int i = 0; i < lp.length; i++) {
			if(lp[i] == c)
				return i;
		}
		return -1;
	}
	
	private int rightIndex(char c) {
		for(int i = 0; i < rp.length; i++) {
			if(rp[i]==c)
				return i;
		}
		return -2;
	}
	
	private boolean isLeft(char c) {
		for(int i = 0; i <lp.length; i++) {
			if(lp[i] == c)
				return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String s1 = "[()]{}{[()()]()}";
		String s2 = "[(]])";
		
		ParenthesisMatch pm = new ParenthesisMatch();
		System.out.print(pm.matchParentheses(s2));		
	}
}
