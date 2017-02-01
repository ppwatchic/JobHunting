### [Source: Leetcode](https://leetcode.com/problems/clone-graph/) 
Clone an undirected graph. Each node in the graph contains a `label` and a list of its `neighbors`.

### Definition for `UndirectedGraphNode`
```
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
```

### Solution
1. Use Depth-First Search to tackle this problem. 
2. At the same time use a `HashMap<>` to keep track the mapping relationship between the original graph node and the cloned graph node. 
```
(1) -----> (2) ------> (1) 
-----------MAPPING--------
(C1) ----> (C2)------>(C1) 
```
If we clone (1) and get (C1), we need to use HashMap to maintain the relationship of (1) and (C1). And when (2) points to (1), 
We can retrive (C1) in the following order: (2)-->(1), and (1) maps to (C1). 

### Code Snippet 
```
public class Solution {
    
    Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
    
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        UndirectedGraphNode clonedNode = clone(node);
        // Is this necessary
        map.clear();
        return clonedNode;
    }
    
    private UndirectedGraphNode clone(UndirectedGraphNode node) {
        if(node == null)
            return null;
        
        UndirectedGraphNode clonedNode = new UndirectedGraphNode(node.label);
        map.put(node, clonedNode);
        for(UndirectedGraphNode nodeInList : node.neighbors) {
            if(map.containsKey(nodeInList)) {
                clonedNode.neighbors.add(map.get(nodeInList));
            } else {
                UndirectedGraphNode nbNode = clone(nodeInList);
                clonedNode.neighbors.add(nbNode);
            }
        }
        return clonedNode;
    }
}
```

### Isuses Remain
1. `map.clear()`: is this line necessary?  Will it cause memory leak if we don't clear map after we use it? 
