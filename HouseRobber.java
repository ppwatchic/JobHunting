package backTracking;

import tree.TreeNode;
import static utils.Printer.*;

public class HouseRobber {
	
	public int rob(TreeNode root) {
		if(root == null)	return 0;
		
		int[] res= dfs(root);
		return Math.max(res[0], res[1]);
	}
	
	private int[] dfs(TreeNode node) {
		if(node == null)	return new int[2];
		int[] left = dfs(node.left);
		int[] right = dfs(node.right);
		int[] res = new int[2];
		res[0] = left[1] + right[1] + node.value;
		res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		return res;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(3);
		
		int money = new HouseRobber().rob(root);
		print(money);
	}

}
