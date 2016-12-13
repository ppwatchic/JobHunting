// Source: https://tonycao.gitbooks.io/leetcode-locked/content/LeetCode%20Locked/c1.4.html 

// Topics: This is a follow up of Shortest Word Distance. The only difference is now you are
// given the list of words and your method will be called repeatedly many times with different parameters. 
// How would you optimize it?

public class ShortestWordDistance {
  private Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
  public ShortestWordDistance(String[] words) {
    // Base cases
    if(words==null || words.length==0)  return; 
    for(int i = 0; i < words.length; i++) {
      if(map.containsKey(words[i])) {
        List<Integer> list = map.get(words[i]);
        list.add(i);
        map.put(words[i], list);
      } else {
        List<Integer> list = new ArrayList<Integer>();
        list.add(i);
        map.put(words[i], list);
      }
    }  
  }
  
  // Assume word1 & word2 always exist in the words[]
  // Assume word1.equals(word2) is always false 
  public int shortestDistance(String word1, String word2) {
    List<Integer> list1 = map.get(word1);
    List<Integer> list2 = map.get(word2);
    int shortest = Integer.MAX_VALUE;
    for(Integer d1 : list1) {
      for(Integer d2 : list2) {
        int tmp = Math.abs(d2 - d1);
        shortest = (shortest > tmp) ? tmp : shortest;
        if(shortest == 1) return 1;
      }
    } 
    return shortest;
  }
}  
