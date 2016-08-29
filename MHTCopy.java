// https://github.com/lydxlx1/LeetCode/blob/master/src/_310.java
// Leetcode: 310. Minimum Height Trees

public class MHTCopy {
    private int nodes;
    private List<Integer>[] e;
    
    /*
     * dist[]: record each node to node-start's distance 
     * path: preserve message about the path rooted by node-start
     */ 
    private void bfs(int start, int[] dist, int[] path) {
        boolean[] visited = new boolean[nodes];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        pre[start] = -1;
        while(!queue.isEmpty()) {
            int v = queue.poll();
            for(int u : e[v]) {
                if(visited[u] == false) {
                    visited[u] = true;
                    pre[u] = v;
                    queue.add(u);
                    dist[u]= dist[v] + 1;
                }
            }
        }
    }
    
    public List<Integer> findMHTRoot(final int n, int[][]edges) {
        if(n==0) return new ArrayList<Integer>();
        if(n == 1) return Arrays.asList(0);
        
        nodes = n;
        int[] d1 = new int[n];
        int[] d2 = new int[n];
        int[] pre = new int[n];
        dfs(0, d1, pre);
        
        int longest = 0;
        for(int i = 0; i < n; i++) {
            if(d1[i]>d1[longest]) longest = i;
        }
        
        dfs(longest, d2, pre);
        longest = 0;
        for(int i = 0; i < n; i++) {
           if(d2[i]>d2[longest]) longest = i;
        }
        
        List<Integer> path = new ArrayList<>();
        while(longest != -1) {
            path.add(longest);
            longest = pre[longest];
        }
        
        if(path.size() % 2 == 1)
            return Arrays.asList(list.get(list.size()/2));
        else 
            return Arrays.asList(list.get(list.size()/2),list.get((list.size()-1)/2));
    }
}
