public class ZigZagString {
	
	
	// 330pm-- 445pm 
	// https://leetcode.com/problems/zigzag-conversion/
	public static String zigZagPattern(String text, int nRows) {
		if(nRows == 1) return text;
		if(nRows >= text.length()) return text;
		
		int step1, step2;
		int len = text.length();
		String res = "";
		
		for(int i = 0; i < nRows; i++) {
			step1 = (nRows - i - 1) * 2;
			step2 = i * 2;
			int pos = i;
			if(pos < len)
				res = res + text.charAt(pos);
			while(true) {
				pos += step1;
				if(pos >= len)
					break;
				if(step1 > 0) 
					res = res + text.charAt(pos);
				pos += step2;
				if(pos >= len)
					break;
				if(step2 > 0)
					res = res + text.charAt(pos);
			}
				
		}
		return res;
	}
	
	public static String zigZagPattern2(String text, int nRow) {
		// corner case 
		if(nRow == 1) 	return text;
		if(nRow >= text.length())	return text; 
		
		String res = "";
		int step1, step2;		
		int len = text.length();
		
		for(int i = 0; i < nRow; i++) {
			step1 = (nRow - 1 - i) * 2;
			step2 = i * 2;
			int pos = i;			
			res += text.charAt(pos);
			while(true) {
				pos += step1;
				if(pos >= len)
					break;
				if(step1 > 0)
					res += text.charAt(pos);
				pos += step2;
				if(pos >= len)
					break;
				if(step2 > 0)
					res += text.charAt(pos);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String text = "PAYPALISHIRING";
		System.out.println(zigZagPattern2(text, 2));

	}
}
