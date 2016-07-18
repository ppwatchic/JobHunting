public class MyTree {
	TreeNode root;
	
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
	
	
	public MyTree(){
		root = null;		
	}
	public MyTree(TreeNode node){
		root = node;		
	}
	
	static class QItem{
		int hd;
		TreeNode node;
		public QItem(TreeNode node, int hd){
			this.hd = hd;
			this.node = node;
		}
	}
	
	public void topViewOfTree(TreeNode root) {
		// corner case 
		if(root == null)
			return;
		
		Queue<QItem> Q = new java.util.LinkedList<QItem>();
		Q.add(new QItem(root, 0));
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(!Q.isEmpty()){
			QItem qi = Q.remove();
			
			if(!set.contains(qi.hd)){
				set.add(qi.hd);
				System.out.print(qi.node.value + " ");
			}
			TreeNode tn = qi.node;
			if(tn.left != null)
				Q.add(new QItem(tn.left, qi.hd - 1));
			if(tn.right != null)
				Q.add(new QItem(tn.right, qi.hd + 1));
		}		
	}

	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(1);
		
		tn.left = new TreeNode(21);
		tn.right = new TreeNode(22);
		tn.left.right = new TreeNode(32);
		tn.right.right = new TreeNode(34);			
		
		MyTree tree = new MyTree(tn);
		
		tree.topViewOfTree(tree.root);
	}
}
