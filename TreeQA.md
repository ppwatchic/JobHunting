**Q:What is Binary Search Tree?, feature of it?**

**A:**BST keeps its order in its structure. For example, a typical BST is: left child < parent; right child > parent. 
In this way, search operation is O(logn) which is faster than O(n), however still slow than hash table with O(1). 

**Q:What is Least Common Ancestor for a Binary Tree?**

**A:**First, Binary Tree is NOT a Binary Search Tree; 

Second, Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

**Q:When to use a breadth-first search and a depth-first search?**

**A:**BFS is an algorithm for traversing or searching tree or graph data structures.  It starts at the tree root and explores the neighbor nodes first, before moving to the next level neighbors.

DFS starts at the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along each branch before backtracking. To utilize the backtracking, we use Stack to help backtracking. 




