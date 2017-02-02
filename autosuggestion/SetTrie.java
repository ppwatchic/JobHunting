// Source: http://sujitpal.blogspot.com/2007/02/three-autocomplete-implementations.html
public class SetTrie {
  private TreeSet<String> lines;
  
  public SetTrie {
    lines = new TreeSet<>();
  }
  
  public void load(String line) {
    lines.add(line);
  }
  
  public boolean matchPrefix(String prefix) {
    Set<String> tailSet = lines.tailSet(prefix);
    for(String tail : tailSet) {
      if(tail.startsWith(prefix)) {
        return true;
      }
  }
  
  public List<String> findCompletions(String prefix) {
    List<String> completions = new ArrayList<>();
    Set<String> tailSet = lines.tailSet(prefix);
    for(String tail : tailSet) {
      if(tail.startsWith(prefix)) {
        completions.add(tail);
      } else {
        break;
      }
     }
     return completions;
  }
}

