import java.io.*;
import java.util.*;

public class SecondMostFreNum {
  
  // second most number in arrays 
  public static int secondMostFrequent(int[] arr) {
    // Use set to detect data presented or not 
    Set<Integer> set = new HashSet<Integer>();
    // Use map's (key;value) pair to remember the count 
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();    
    
    for(Integer num : arr) {
      if(set.contains(num)) {
        int f = map.get(num);
        map.put(num, f+1);
      } else {
        set.add(num);
        map.put(num, 1);
      }
    }
    
    int mostFre = 0;
    int mostData = 0;
    int secFre = 0;
    int secData = 0;

    // Iterate through the map
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int data = entry.getKey();
      int fre = entry.getValue();
      
      if(fre >= mostFre) {
        secData = mostData;
        secFre = mostFre;
        mostFre = fre; 
        mostData = data;
      } else if( fre > secFre) {
        secData = data;
        secFre = fre;
      }
    }
    
    return secData;
  }  
  
  public static void main(String[] args) {
    int[] arr = new int[]{1,1,3,3,3,4,4,5,5,6,6,6,6};
    int fre = secondMostFrequent(arr);
    System.out.println(fre);
  }
}
