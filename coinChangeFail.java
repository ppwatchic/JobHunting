/**
 * 322. Coin Change https://leetcode.com/problems/coin-change/ 
 * You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)  
 */

/* Naive solution 
 * run time limit exceed
 * / 

public class Solution {
    public int coinChange(int[] coins, int amount) {
        
        // corner case 
        if(amount == 0)
            return 0;
         
        int res = -1;
        // loop through every coin     
        for(int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount) {
                int sub_res = coinChange(coins, amount - coins[i]);
                
                if(sub_res != -1) {
                    if(res == -1)
                        res = sub_res + 1;
                    else if(res > sub_res + 1)
                        res = sub_res + 1;
                }
            }
        }    
        
        return res;
    }
}
