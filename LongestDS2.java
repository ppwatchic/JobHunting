package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/largest-divisible-subset/ 
// 37ms runtime, better than last tried: 44ms. 
public class LongestDS2 {
	
	public List<Integer> largestDivisibleSubSet(int[] input) {
		List<Integer> result = new ArrayList<>();
		if(input == null || input.length == 0) {
			return result;
		}
		if(input.length == 1) {
			result.add(input[0]);
			return result;
		}
		
		Arrays.sort(input);
		
		// for each element, find their position in corresponding subset 
		// O(n^2)
		int[] dp= new int[input.length];
		dp[0] = 1;
		int maxIndex = 0;
		for(int i = 1; i < input.length; i++) {
			for(int j = i - 1; j >=0; j--) {
				if(input[i] % input[j] == 0) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
					if(dp[i] > dp[maxIndex]) {
						maxIndex = i;
						break;
					}
				}
			}
			dp[i] = dp[i] > 0 ? dp[i] : 1;
		}
		
		int needed = 1;
		for(int i = 0; i <= maxIndex; i++) {
			if(input[maxIndex] % input[i] ==0 && needed==dp[i]) {
				needed++;
				result.add(input[i]);
			}
		}
		return result;		
	}

	public static void main(String[] args) {
		int[] input = { 3,4,16,8} ;
		
		LongestDS2 ds = new LongestDS2();
		List<Integer> result = ds.largestDivisibleSubSet(input);
		
		//result.remove(0);
		for(Integer i : result) 
			System.out.println(i);
	}

}
