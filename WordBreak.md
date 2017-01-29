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

## Optimized based on DP 


## Source
1. [Leetcode 139. Word Break](https://leetcode.com/problems/word-break/) 
