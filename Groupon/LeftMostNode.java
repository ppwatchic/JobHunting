import java.io.*;
import java.util.*;

class LeftMostNode {
  
  class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { value = val; }
  }
  
  class NodeWithIndex {
    TreeNode node;
    int index;
    NodeWithIndex(TreeNode node, int index) {
      this.node = node;
      this.index = index;
    }
  }
  
  // Leftmost node of a binary tree
  // root: left-index 0;
  // left-child: left-index 1;
  // right-child: left-index -1; 
  // Recursive method: visited all nodes; return node with the largest left-index.   
  public TreeNode findLeftMost(TreeNode root) {
    if(root==null)
      return root;
    
    NodeWithIndex leftMost = null;
    Queue<NodeWithIndex> queue = new LinkedList<NodeWithIndex>();
    queue.add(new NodeWithIndex(root,0));
    
    while(!queue.isEmpty()) {
      NodeWithIndex nwi = queue.poll();
      
      if(leftMost == null)
        leftMost = nwi;
      else if(nwi.index > leftMost.index) {
        leftMost = nwi;
      }
      
      if(nwi.node.left != null) {
        queue.add(new NodeWithIndex(nwi.node.left, nwi.index+1));
      }
      if(nwi.node.right != null) {
        queue.add(new NodeWithIndex(nwi.node.right, nwi.index-1));
      }
    }
    return leftMost.node;
  }
  
}
