// References: http://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html
public class FirstNonRepeat {

  //Repeat keyword: use Set
  //First keyword: use List
  public char firstNonRepeat(String str) {
    if(str == null || str.length() == 0) 
      throw new IllegalArgumentException();
    
    Set<Character> repeat = new HashSet<Character>();
    List<Character> nonrepeat = new ArrayList<Character>();
    
    char[] charArr = str.toCharArray();
    for(char ch : charArr) {
      if(repeat.contains(ch)) {
        continue;
      }
      if(nonrepeat.contains(ch)) {
        nonrepeat.remove(ch);
        repeat.add(ch);
      } else {
        nonrepeat.add(ch);
      }
    }    
    return nonrepeat.get(0);
  }
  
  // LinkedHashMap is another option 
}
