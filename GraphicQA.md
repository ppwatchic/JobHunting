**Q:What is topological sorting? And what is DFS(depth-first-traversal)**  
**A:** In **DFS**, we print a vertex and then recursively call DFS for its adjacent vertices. DFS of a graph is similar to that 
of DFS of a tree,  differeciating in that in graph we may visit the same vertex a couple times if there is circle iin the graph.   
In **topological sorting**, we need to print a vertex before its adjacent vertices. 

**Q: What is a Spanning Tree?**  
**A:** A Spanning Tree is a subSet of a graph **G**, which has all the vertices covered with minimum possible number of edges. Hence, a spanning tree does not have cycles and it can not be disconnected.  
A complete undirected graph can have maximum \\(n^n\\) number ![equation](http://www.sciweavers.org/tex2img.php?eq=1%2Bsin%28mc%5E2%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=) of spanning trees, where n is number of nodes. 
