public class MissingInteger {
  
  // Sum = (btmV + topV) * Height / 2;
  public int findMissing(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum = 0;
    
    for(int num : arr) {
      // find max
      if(num>max) max = num;
      // find min
      if(num<min) min = num;
      // calculate sum
      sum += num;
    }
    
    int expectedSum = (min + max) * (max - min) / 2;
    return (expectedSum - sum);    
  }
  
}
