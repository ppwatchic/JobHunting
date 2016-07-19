package Algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// Find a pair with given sum in a Balanced BST
// Run-time complexity O(n) and space O(logn)

public class GivenSumInBBST {
	static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int v) {
			value = v;
		}
	}
	
	public boolean isFindAPair(TreeNode root, int sum) {
		if(root == null)
			return false;
		
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		
		boolean done1 = false, done2 = false;
		int val1 = 0, val2 = 0;
		TreeNode cur1 = root, cur2 = root;
		
		while(true){
			// Find next node in normal Inorder traversal. 
			while(done1 == false){
				if(cur1 != null) {
					s1.add(cur1);
					cur1 = cur1.left;
				}else {
					if(s1.isEmpty())
						done1 = true;
					else {
						cur1 = s1.pop();
						val1 = cur1.value;
						cur1 = cur1.right;
						done1 = true;
					}
				}
			}
			
			// Find next node in Inverse InOrder 
			while(done2 == false){
				if(cur2 != null) {
					s2.add(cur2);
					cur2 = cur2.right;
				} else {
					if(s2.isEmpty())
						done2 = true;
					else{
						cur2 = s2.pop();
						val2 = cur2.value;
						cur2 = cur2.left;
						done2 = true;
					}
				}
			}
			
			if((val1 != val2) && ((val1 + val2) == sum)){
				System.out.println(val1 + " + " + val2 + " = " + sum);
				return true;
			} else if((val1 + val2) > sum) {
				// change val2 
				done2 = false;
			}else if((val1 + val2) < sum){
				// change val1
				done1 = false;
			}
			
			if(val1 >= val2) {
				System.out.println("no good luck! exit");
				return false;
			}			
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.right = new TreeNode(25);
		
		GivenSumInBBST gt = new GivenSumInBBST();
		gt.isFindAPair(root, 34);
	}

}
