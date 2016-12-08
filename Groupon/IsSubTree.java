
public class IsSubTree {
  class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) { this.value = value; }
  }  
  
  public boolean isSubtree(TreeNode root, TreeNode subroot) {
    // base case
    if(root == null) 
      return subroot == null;
    if(subroot == null)
      return true;
    
    // Use queue to conduct BFS of root 
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    while(!queue.isEmpty()) {
      TreeNode node = queue.remove();
      boolean sub = isEqual(node, subroot);
      if(sub == true)
        return true;
      if(node.left != null)
        queue.add(node.left);
      if(node.right != null)
        queue.add(node.right);
    }
    return false;    
  }
  
  private boolean isEqual(TreeNode node1, TreeNode node2) {
    if(node1 == null)
      return node2 == null;
    if(node2 == null)
      return false;
    
    if(node1.value != node2.value)
      return false;
    boolean le = isEqual(node1.left, node2.left);
    if(le == false)
      return false;
    return isEqual(node1.right, node2.right);    
  }

}
