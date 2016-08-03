package Algorithms;

// http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/

public class FlipA2BBits {

	public static void main(String[] args) {
		int v1 = 0b100001111;
		int v2 = 0b11110000;
		
		int res = v1 ^ v2;
		int count = 0;
		while(res != 0) {
			if((res & (1<<0)) != 0){			
				count++;
				res = res >>> 1;
			}				
		}
		System.out.println(count);
	}

}
