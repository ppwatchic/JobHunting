

public class FindNonRepeatNum {

  // Assume only one number appears just ONCE; all others appear exactly twice. 
  public int findSingleNum(int[] nums) {
    Arrays.stream(nums).reduce(0, (x,y) -> x^y));
  }
  
  // If there are more than one single number, then 
  // use two set data structures 
  // One to maintain repeated data; 
  // ONe to maintain un-repeated data;
  // Run-time complexity: O(n); 
  // Memory complexity: O(n);
  public static int[] findSingleNums(int[] arr) {
    Set<Integer> single = new HashSet<>();
    Set<Integer> repeat = new HashSet<>();
    
    for(int num : arr) {
      if(repeat.contains(num)) continue;
      if(single.contains(num)) {
        single.remove(num);
        repeat.add(num);
      } else {
        single.add(num);
      }
    }
    
    int len = single.size();
    int[] res = new int[len];
    
    int i = 0;
    for(Integer sgl : single) {
      res[i] = sgl;
    }
    return res;
  }
  
  
  
}
