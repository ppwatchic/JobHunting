package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class KeyPadLetter2Num {
	static Map<Character, Integer> MAP;
	
	static class BSTreeNode{
		long value;
		String s;
		BSTreeNode left;
		BSTreeNode right;
		
		BSTreeNode(long v, String str){
			value = v;
			s = str;
			left = null;
			right = null;			
		}
	}
	
	static class BSTree{
		BSTreeNode root;
		
		BSTree(){
			root = null;
		}
		
		BSTree(BSTreeNode node) {
			root = node;
		}
		
		public void add(BSTreeNode node){
			BSTreeNode tmp = root;
			if(root==null)
				root = node;
			
			while(tmp != null) {
				int res = compare(tmp, node);
				if(res > 0) { 			// insert to left subtree 
					if(tmp.left == null){ 
						tmp.left = node;
						break;
					}
					else 
						tmp = tmp.left;					
				} else if(res < 0) { 	// insert to right subtree
					if(tmp.right == null){
						tmp.right = node;
						return;						
					} else 
						tmp = tmp.right;
				} else
					throw new IllegalArgumentException("Same Node in the BSTree!" + node.value + node.s);
			}			
		}
		
		
		// Reverse Inorder 
		public void viewInDesc(){
			Stack<BSTreeNode> stack = new Stack<BSTreeNode>();			
			if(root == null)
				return;
						
			BSTreeNode node = root;
			while(true){
				if(node == null) {
					if(!stack.isEmpty()) {
						node = stack.pop();
						System.out.println(node.value + " " + node.s);
						node = node.left;
						continue;
					} else 
						return;
				} else if(node.right != null) {
					stack.push(node);
					node = node.right;	
				} else {
					System.out.println(node.value + " " + node.s);
					node = node.left;					
				}
			}
		}
	}
	
	public static int compare(BSTreeNode node1, BSTreeNode node2) {
		if(node1.value > node2.value)
			return 1;
		else if(node1.value == node2.value){			
			return 0 - node1.s.compareTo(node2.s);
		} else 
			return -1;
	}
	
	public KeyPadLetter2Num(){
		MAP = new HashMap<Character, Integer>();
		MAP.put('a', 2);
		MAP.put('b', 2);
		MAP.put('c', 2);	
		MAP.put('d', 3);
		MAP.put('e', 3);
		MAP.put('f', 3);
		MAP.put('g', 4);
		MAP.put('h', 4);
		MAP.put('i', 4);
		MAP.put('j', 5);
		MAP.put('k', 5);
		MAP.put('l', 5);
		MAP.put('m', 6);
		MAP.put('n', 6);
		MAP.put('o', 6);
		MAP.put('p', 7);
		MAP.put('q', 7);
		MAP.put('r', 7);
		MAP.put('s', 7);
		MAP.put('t', 8);
		MAP.put('u', 8);
		MAP.put('v', 8);
		MAP.put('w', 9);
		MAP.put('x', 9);
		MAP.put('y', 9);
		MAP.put('z', 9);
	}
	
	public static void keyPadLetter2Num(List<String> l){
		BSTree tree = new BSTree();
				
		// Step 1: convert string -> integer 
		for(int i = 0; i < l.size(); i++) {
			String s = l.get(i);
			long value = 0;
			for(int j = 0; j < s.length(); j++){
				value = value * 10 + MAP.get(s.charAt(j));
			}
			tree.add(new BSTreeNode(value, s));
		}
		tree.viewInDesc();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("amazon");
		
		l.add("rat");
		l.add("pat");
		
		l.add("aa");
		
		l.add("zz");
		l.add("zzz");
		
		l.add("pingpingwu");
		System.out.println("MAX_VALUE " + Integer.MAX_VALUE);
		
		KeyPadLetter2Num kp = new KeyPadLetter2Num();
		
		keyPadLetter2Num(l);
	}

}
