public class RecoverBST {
    // 7ms beats 19.30% 
	public void recoverTreeII(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode firstNode = null, secondNode = null;
		
		// In-order traverse 
		stuffStack(stack, root);
		
		TreeNode node;
		firstNode = stack.peek();
        while(!stack.isEmpty()) {
        	node = stack.pop();
        	if(secondNode == null) {
        		if(node.val >= firstNode.val) {   // correct      			 
        			firstNode = node;
        		} else {
        			secondNode = node;          			
        		}
        	} else {
        		if(node.val < secondNode.val) {        			        				
    				secondNode = node;
    				break;
    			}
        	}
        	// put the node's right sub-tree into stack if existed;
        	stuffStack(stack, node.right);	
        }
        
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
	}
	
	private void stuffStack(Stack<TreeNode> stack, TreeNode root) {
		if(root != null)
			stack.push(root);
		else return;
        while(root.left != null) {
        	stack.push(root.left);
        	root = root.left;
        } 
	}
}
