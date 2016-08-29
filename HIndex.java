package arrayPrac;

import java.util.Arrays;

public class HIndex {

	// https://leetcode.com/problems/h-index/ 
	// beats 43.98%
	public int hIndex(int[] citations){
		if(citations == null || citations.length == 0)
			return 0;
		
		Arrays.sort(citations);
		int len = citations.length;
		for(int i = 0; i < citations.length; i++) {
			if(len <= citations[i])
				return len;
			else 
				len--;
		}
		return len;
	}
	public static void main(String[] args) {
		HIndex hi = new HIndex();
		int[] c = {1,1,2,4,5,6};
		System.out.println("The research's index is: " + hi.hIndex(c));
		
		c = new int[]{3,0,6,1,5};
		System.out.println("The research's index is: " + hi.hIndex(c));
		
		c = new int[]{1};
		System.out.println("The research's index is: " + hi.hIndex(c));
		
		c = new int[] {11, 15};
		System.out.println("The research's index is: " + hi.hIndex(c));
		
	}

}
