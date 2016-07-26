package Algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class BST2DLinkedList {
	private final static boolean LEFT = false;
	private final static boolean RIGHT = true;
	private static TreeNode root = null;
	static {
		root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(8);
	}
	
	
	private static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int v){
			value = v;
			left = right = null;
		}
	}
	
	
	public static void bST2DLinkedList(){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		if(root != null)
			ll.addLast(root.value);
				
		if(root.left != null)
			makeDLinkedListHelper(root.left, ll, LEFT);
		if(root.right != null)
			makeDLinkedListHelper(root.right, ll, RIGHT);
		
		// Test case 
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
	}
	public static void makeDLinkedListHelper(TreeNode node, LinkedList<Integer>ll, boolean dir){
		if(node == null)
			return;
		
		if(dir == LEFT){	// post-order left subtree 
			if(node.right != null)
				makeDLinkedListHelper(node.right, ll, LEFT);
			ll.addFirst(node.value);
			if(node.left != null)
				makeDLinkedListHelper(node.left, ll, LEFT);
		} else {
			if(node.left != null)
				makeDLinkedListHelper(node.left, ll, RIGHT);
			ll.addLast(node.value);
			if(node.right != null)
				makeDLinkedListHelper(node.right, ll, RIGHT);
		}
	}
	

	public static void main(String[] args) {
		BST2DLinkedList bll = new BST2DLinkedList();
		bll.bST2DLinkedList();
	}

}
