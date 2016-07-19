package Algorithms;

import java.util.Stack;

public class TraversalSpinal {
	
	static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int v){
			value = v;
			left = null;
			right = null;
		}
	}
	
	static class Tree{
		TreeNode root;
		
		Tree(){ 
			root = null;
		}
		Tree(TreeNode node){
			root = node;
		}
	}

	// use stack to preserver the nodes 
	public static void traversalInSpinal(Tree tree){
		if(tree.root==null)
			return;
		Stack<TreeNode> cs = new Stack<TreeNode>();
		Stack<TreeNode> ns = new Stack<TreeNode>();
		
		int height = 0;
		cs.add(tree.root);
		while(!cs.isEmpty()){
			if((height %2) == 0){
				while(!cs.isEmpty()){
					TreeNode node = cs.pop();
					if(node.right != null)
						ns.push(node.right);
					if(node.left != null)
						ns.push(node.left);
					System.out.println(node.value + " ");
				}
				Stack<TreeNode> tmp = cs;
				cs = ns;				
				ns = tmp;
				height++;
			}
			else {
				while(!cs.isEmpty()){
					TreeNode node = cs.pop();
					if(node.left != null)
						ns.push(node.left);
					if(node.right != null)
						ns.push(node.right);
					System.out.println(node.value + " ");
				}
				Stack<TreeNode> tmp = cs;
				cs = ns;				
				ns = tmp;
				height++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left = new TreeNode(7);	
		root.left.left.left = new TreeNode(8);
		root.right.right.right = new TreeNode(9);
		root.right.right.right.right = new TreeNode(10);
		root.left.left.left.left = new TreeNode(11);
		
		
		
		traversalInSpinal(new Tree(root));
	}

}
