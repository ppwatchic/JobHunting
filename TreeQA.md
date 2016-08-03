**Q:What is Binary Search Tree?, feature of it?**  
**A:** BST keeps its order in its structure. For example, a typical BST is: left child < parent; right child > parent. 
In this way, search operation is O(logn) which is faster than O(n), however still slow than hash table with O(1). 

**Q:What is Least Common Ancestor for a Binary Tree?**  
**A:**First, Binary Tree is NOT a Binary Search Tree; 

Second, Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

**Q:When to use a breadth-first search and a depth-first search?**  
**A:**BFS is an algorithm for traversing or searching tree or graph data structures.  It starts at the tree root and explores the neighbor nodes first, before moving to the next level neighbors.

DFS starts at the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along each branch before backtracking. To utilize the backtracking, we use Stack to help backtracking. 

**Q:What is a Complete Binary Tree? A full binary tree? A perfect binary tree**  
**A:**A full binary tree is a tree in which all nodes have 0 or 2 children. 

A perfect binary tree is a binary tree in which all internal nodes have 2 children and all leaves have the same level or the same depth. 

In a complete binary tree, all level except possible the last level is completely filled, and all nodes in the last level are as far left as possible. Pros: a complete binary tree can be efficiently represent by array.

**Q: what is preorder search, post order search, and Inorder search?**  
**A:** PreOrder: visit each node before its children; 

PostOrder: visit each node after its children;

InOrder(for binary tree only) visit left subtree, node, right subtree.   

**Q: What is a Trie? How to construct a Trie?**  
**A:**A [Trie](https://en.wikipedia.org/wiki/Trie) is also called digital tree and sometimes radix tree or prefix tree, is a kind of search tree -- an ordered tree data structure that is used to store a  dynamic set or associative array where keys are ususlly strings.

**Q: Longest repeated substring problem or a suffix tree of letters.**  
**A:** The longest repeated substring problem is the problem of finding the longest substring of a string that occurs at least twice. To solve this problem, we can build a suffix tree for the string, and finding the deepest internal node in the tree. Depth is measured by the number of characters traversed from the root. 

**[Ukkonen](http://www.geeksforgeeks.org/ukkonens-suffix-tree-construction-part-4/)'s suffix tree construction**




