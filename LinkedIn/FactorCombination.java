public class FactorCombination {

  public List<List<Integer>> getFactors(int n) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(n <= 3)  return result;
    getFactors(n, 2, new ArrayList<Integer>(), result);
    
    return result;
  }
  
  private void getFactors(int n, int start, List<Integer> current, List<List<Integer>> result) {
    if(n == 1) {
      if(current.size() > 1) 
          result.add(new ArrayList<Integer>(current));
      return;
    }
    
    for(int i = start; i <= (int) Math.sqrt(n); i++) {
      if(n % i != 0) continue;
      current.add(i);
      getFactors(n/i, i, current, result);
      current.remove(current.size() - 1);       
    }
    
    int i = n;
    current.add(n);
    getFactors(n/i, i, current, result);
    current.remove(current.size()-1);
  }

}
