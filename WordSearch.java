public class WordSearch {
    public List<String> findWords(List<String> words, char[][] board) {
        List<String> result = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                dfs(root, i, j, board, result);
            }
        }
        return result;
    }
    
    private void dfs(TrieNode p, int i, int j, char[][] board, List<String> result) {
        char c = board[i][j];
        if(c == '#' || p.kids[c - 'a'] == null) return;
        p = p.kids[c - 'a'];
        if(p.word != null) {
            result.add(p.word);
            p.word = null;
        }
        
        board[i][j] = '#';
        if(i > 0) dfs(p, i - 1, j, board, result);
        if(j > 0) dfs(p, i, j - 1, board, result);
        if(i < board.length - 1) dfs(p, i + 1, j, board, result);
        if(j < board[0].length - 1) dfs(p, i, j + 1, board, result);
        board[i][j] = c;
    }
    
    private TrieNode buildTrie(List<String> words) {
        TrieNode root = new TrieNode();
        for(String word : words) {
            TrieNode p = root; 
            for(char c : word.toCharArray()) {
                if(p.kids[c - 'a'] == null) p.kids[c - 'a'] = new TrieNode();
                p = p.kids[c - 'a'];
            }
            p.word = word;
        }
        return root;
    }

    class TrieNode {
        String word;
        TrieNode[] kids = new TrieNode[26];
        TrieNode() {}
    }
    
    public static void main(String[] args) {
    	char[][] board = {
    			{'o','a','a','n'},
    			{'e','t','a','e'},
    			{'i','h','k','r'},
    			{'i','f','l','v'}
    	};
    	
    	String[] words = {"oath", "pea", "eat", "rain"};
    	List<String> result = new WordSearch().findWords(words, board);
    	for(String s : result) 
    		System.out.println(s);
    }
}
