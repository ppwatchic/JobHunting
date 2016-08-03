package Algorithms;

import java.util.Arrays;

// http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/ 

public class CoinChange {

	// Solution 1: brute-force 
	public static int count(int[] coins, int value) {
		if(value == 0)
			return 1;
		if(value < 0)
			return 0;
		if(coins==null || coins.length == 0)
			return 0;
				
		return countHelper(coins, coins.length - 1, value);		
	}
	
	private static int countHelper(int[] coins, int m, int value) {
		if(value == 0)
			return 1;
		if(m < 0 && value >= 1)
			return 0;
		if(value < 0)
			return 0;
		return countHelper(coins, m - 1, value) + countHelper(coins, m, value - coins[m]);
	}	
	
	
	// Solution 2: 
	public static int countSolution(int[] coins, int value) {
		Arrays.sort(coins);
		int count = 0;		
		count = getZero(coins, coins.length - 1, value);		
		return count;
	}
	
	// to make up value with coins within range 0--pos
	private static int getZero(int[] coins, int pos, int value) {
		if(value == 0)
			return 1;
		int count = 0;
		
		for(int i = pos; i >= 0; i--) {
			int quo = value / coins[i];
			int rem = value % coins[i];
			if(quo == 0) continue;
			else {
				if(rem == 0)
					count++;
				else count += getZero(coins, i - 1, rem);
				while((--quo) > 0) {
					count += getZero(coins, i - 1, value - quo * coins[i]); 
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int value = 100;
		int[] coins = {1,2,3,7};
		int res = 0;
		long tim;
		
		tim = System.nanoTime();
		for(int i = 0; i < 10; i++)
			res = count(coins, value);	
		tim = System.nanoTime() - tim; 
		System.out.print(res + "  ");
		System.out.println(" " + tim);
		System.out.println();
		
		
		// A better solution 
		tim = System.nanoTime();
		for(int i = 0; i < 10; i++)
			res = countSolution(coins, value);
		tim = System.nanoTime() - tim;
		System.out.print(res + " ");
		System.out.println(" " + tim);
	}
}
