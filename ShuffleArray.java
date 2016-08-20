package ArraysPrac;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Leetcode: shuffle an array 

public class ShuffleArray {
	
	private final int[] cards;
	
	public ShuffleArray(int[] nums) {
        cards = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        	cards[i] = nums[i];
        }
    }
	
	/** Resets the array to its original configuration and return it. */
    public int[] reset() {
        int[] res = new int[cards.length];
        for(int i = 0; i < cards.length; i++) {
        	res[i] = cards[i];
        }
        return res;
    } 
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = new int[cards.length];
        
        for(int i = 0; i < cards.length; i++)
        	res[i] = cards[i];        
        
        Random rnd = ThreadLocalRandom.current();
        for(int i = (cards.length -1); i > 0; i--) {
        	int index = rnd.nextInt(i+1);
        	// swap data 
        	int tmp = res[index];
        	res[index] = res[i];
        	res[i] = tmp;
        }
        return res;
    }    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
