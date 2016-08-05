**Q:What is topological sorting? And what is DFS(depth-first-traversal)**  
**A:** In **DFS**, we print a vertex and then recursively call DFS for its adjacent vertices. DFS of a graph is similar to that 
of DFS of a tree,  differeciating in that in graph we may visit the same vertex a couple times if there is circle iin the graph.   
In **topological sorting**, we need to print a vertex before its adjacent vertices. 

**Q: What is a Spanning Tree?**  
**A:** A Spanning Tree is a subSet of a graph **G**, which has all the vertices covered with minimum possible number of edges. Hence, a spanning tree does not have cycles and it can not be disconnected.  
A complete undirected graph can have maximum n^(n-2) number of spanning trees, where n is number of nodes. 

**Q:Tree And Forest?**  
**A**: A tree in a graph is different from the one of a rooted tree.  
A tree is an undirected graph **T** is the one that: T is connected; T has no cycles.  
A forest is an undirected graph without cycles. The components of a forest are trees.     
**A spanning tree is not unique unless the graph is a tree.**


