package medium;

import definition.TreeNode;

public class CountCompleteTreeNodes {

	public static void main(String[] args) {
		
//		TreeNode root = null;
		
//		TreeNode root = new TreeNode(5);
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
//		root.right.left = new TreeNode(6);
//		root.right.right = new TreeNode(6);
//		root.left.left.left = new TreeNode(4);
//		root.left.left.right = new TreeNode(5);
//		root.left.right.left = new TreeNode(6);
//		root.left.right.right = new TreeNode(6);
		
		System.out.println(new CountCompleteTreeNodes().countNodes(root));
	}

	public int countNodes(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		return helper(root, 1);
	}
	
	public Integer helper(TreeNode node, int count) {
		
		if(node.left == null && node.right == null) {
			return 1;
		}
		
		Integer leftCount = 0, rightCount = 0;
		
		if(node.left != null) {
			leftCount = helper(node.left, count + 1);
		}
		if(node.right != null) {
			rightCount = helper(node.right, count + 1);
		}
		
		return leftCount + rightCount + 1;
	}
}
