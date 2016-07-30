package Algorithms;

import java.util.LinkedList;
import java.util.Queue;

import Algorithms.MyTree.TreeNode;

public class TreePtr2BFSNode {

	static TreeNode root;
	
	static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode ptr;
		
		TreeNode(int v){
			value = v;
			left = null;
			right = null;
			ptr = null;
		}
	}
	
	static{
		root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(8);
		root.left.left.left = new TreeNode(1);
		root.right.right.right = new TreeNode(10);
	}
	
	// 822pm--912 
	// FIFO
	public static void ptr2BFSNode(TreeNode root){
		// corner case
		if(root==null || (root.left == null && root.right ==null))
			return;
		
		// use Queue to conduct BFS
		Queue<TreeNode> queueNode = new LinkedList<TreeNode>();
		queueNode.add(root);	
		TreeNode ptr = root;
		while(!queueNode.isEmpty()){
			TreeNode node = queueNode.poll();
			boolean dummy = (node.left != null) ? queueNode.add(node.left) : false;
			dummy = (node.right != null) ? queueNode.add(node.right) : false;	
			if(!node.equals(root)){
				ptr.ptr = node;
				ptr = node;
			}			
		}		
	}
	
	public static void viewTreeViaPtr(TreeNode root){
		TreeNode ptr = root;
		while(ptr != null) {
			System.out.println(ptr.value);
			ptr = ptr.ptr;
		}
	}
	
	public static void main(String[] args) {
		ptr2BFSNode(root);
		viewTreeViaPtr(root);
	}

}
