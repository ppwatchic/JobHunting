package Algorithms;

import java.util.Queue;

public class SortedArray2Tree {
	static class TreeNode{
		int value;
		TreeNode left, right;
		TreeNode(int v){
			value = v;
			left = right = null;
		}
	}
	static class Tree{
		TreeNode root;
		Tree(){
			root = null;
		}
		Tree(TreeNode node) {
			root = node;
		}
		
		public void TreeViewPreOrder() {
			if(root==null){
				System.out.println("Tree is empty!");
				return;
			}
			
			Queue<QItem> q = new java.util.LinkedList<QItem>();
			q.add(new QItem(root,0));
			int height = 0;
			while(!q.isEmpty()){
				QItem tmp = q.poll();				
				System.out.println(tmp.node.value + " with height " + tmp.height);
				if(tmp.node.left != null){
					q.add(new QItem(tmp.node.left,tmp.height + 1));					
				}
				if(tmp.node.right != null){
					q.add(new QItem(tmp.node.right,tmp.height + 1));					
				}
				
			}
			
		}
	}
	
	static class QItem{
		TreeNode node;
		int height;
		QItem(TreeNode node, int h) {
			this.node = node;
			height = h;
		}
	}
	
	public static Tree sortedArray2Tree(int[] sa){		
		int low = 0, high = sa.length - 1;
		TreeNode root = null;	
		if(sa==null || sa.length==0)
			return new Tree(root);
		
		int mid = (low + high) / 2;
		root = new TreeNode(sa[mid]);
		root.left = subTree(sa, 0, mid - 1);
		root.right = subTree(sa, mid + 1, sa.length - 1);			
	
		return new Tree(root);
	}
	
	/**
	 * start/end: inclusive 
	 */
	public static TreeNode subTree(int[] arr, int start, int end){
		if(end<start)
			return null;
		if(end==start)
			return new TreeNode(arr[start]);
		
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = subTree(arr, start,mid - 1);
		root.right = subTree(arr, mid + 1, end);
		return root;
	}
	
	public static void main(String[] args) {
		// test case 1: 
		Tree tree = sortedArray2Tree(new int[]{});
		tree.TreeViewPreOrder();
		System.out.println();
		
		tree = sortedArray2Tree(new int[]{1,2,3});
		tree.TreeViewPreOrder();
		System.out.println();
		
		tree = sortedArray2Tree(new int[]{1,2,3,4,5});
		tree.TreeViewPreOrder();
		System.out.println();
	}

}
