public class WordLadder {
    
    // Use two-way search, either search from begin->end, or end->begin 
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        // Contains word set after all possibles after one transformation 
        Set<String> beginSet = new HashSet<String>();
        Set<String> endSet = new HashSet<String>();
        
        beginSet.add(beginWord);
        endSet.add(endWord);
        
        int ladder = 1;
        Set<String> visited = new HashSet<String>();
        while(!beginSet.isEmpty() && !endSet.isEmpty()) {
            // Here to enforce two-way search
            if(beginSet.size() > endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = beginSet;
            }    
        
            Set<String> tmp = HashSet<String>();
            // Iterate through words in beginSet
            for(String word : beginSet) {
                // For word, each Character will be replaced with 'a' till 'z'
                char[] chs = word.toCharArray();
                for(int i = 0; i < chs.length; i++) {
                    for(char rep = 'a'; rep <= 'z'; rep++) {
                        if(chs[i] == rep)
                            continue;
                        char old = chs[i];
                        chs[i] = rep;
                        String newWord = String.valueOf(chs);
                        
                        // If also in endSet, then job done
                        if(endSet.contains(newWord)) {
                            return ladder+1;
                        }
                        if(wordList.contains(newWord) && !visited.contains(newWord)) {
                            visited.add(newWord);
                            tmp.add(newWord);
                        }
                        
                        //resuem the word
                        chs[i] = old;
                    }
                }
            }
            // Update the current transformation state
            beginSet = tmp;
            ladder++;
        }
        
        return ladder;
        
    }
}
