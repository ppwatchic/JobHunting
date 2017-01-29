## Brute-force Solution
1. Run-time complexity:  
2. Source code:  
```
public boolean wordBreakBruteForce(String s, List<String> wordDict) {
		 // Omit corner case 
		 
		 // List -> HashSet
		 Set<String> set = new HashSet<>();
		 int maxLen = 0;
		 for(String word : wordDict) {
			 set.add(word);
			 maxLen = (maxLen < word.length()) ? word.length() : maxLen;
		 }
		 
		 if(helper(s, set, maxLen)) 
			 return true;
		 else return false;
	 }
	 
	 // DFS 
	 private boolean helper(String s, Set<String> set, int maxLen) {		 
		 for(int i = 1; i <= maxLen && i <= s.length(); i++) {
			 String first = s.substring(0, i);
			 if(set.contains(first)) {
				 if(i == s.length())
					 return true;
				 if(helper(s.substring(i, s.length()), set, maxLen))
					 return true;
			 }
		 }
		 
		 return false;
	 }
```



## A Dynamic-Programming Solution
1. Runtime Complexity: O(n^2) where n stands for length of String s. 
2. Source code: 
```
public boolean wordBreakDynamicProgramming(String s, List<String> wordDict) {
		// Omit corner case 
		 
		// List -> HashSet
		Set<String> set = new HashSet<>();		
		for(String word : wordDict) {
			set.add(word);			
		}		
		
		boolean[] isWord = new boolean[s.length() + 1];
		isWord[0] = true;
		for(int i = 1; i <= s.length(); i++) {
			for(int j = i - 1; j >= 0; j--) {
				if(isWord[j] && set.contains(s.substring(j, i))) {
					isWord[i] = true;
					break;
				}
			}
		}
		
		return isWord[s.length()];		
	 }
```

## Optimized based on DP 
```
// Optimzied inner loop: always find the one that has been marked as true 
	 public boolean wordBreakOptimizedDP(String s, List<String> wordDict) {
			// Omit corner case 
			 
			// List -> HashSet
			Set<String> set = new HashSet<>();		
			for(String word : wordDict) {
				set.add(word);			
			}		
			
			int[] marker = new int[s.length() + 1];	
			int count = 1;
			marker[0] = 0;
			for(int i = 1; i <= s.length(); i++) {
				for(int j = count; j >0; j--) {
					if(set.contains(s.substring(marker[j], i))) {
						marker[count++] = i;
						break;
					}
				}
			}
			
			return s.length() == marker[--count];		
	}
```

## Source
1. [Leetcode 139. Word Break](https://leetcode.com/problems/word-break/) 
