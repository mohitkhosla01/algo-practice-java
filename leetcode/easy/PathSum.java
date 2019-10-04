package easy;

import definition.TreeNode;

public class PathSum {

	public static void main(String[] args) {
		
//		TreeNode root = null;
		
		TreeNode root = new TreeNode(10);
		
//		TreeNode root = new TreeNode(22);
		
//		TreeNode root = new TreeNode(5);
//		root.left = new TreeNode(4);
//		root.right = new TreeNode(8);
//		root.left.left = new TreeNode(11);
//		root.right.left = new TreeNode(13);
//		root.right.right = new TreeNode(4);
//		root.left.left.left = new TreeNode(7);
//		root.left.left.right = new TreeNode(3);
//		root.right.left.right = new TreeNode(1);
		
		int sum = 22;
		
		System.out.println(new PathSum().hasPathSum(root, sum));
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		
		if(root == null) {
			return false;
		}
		else {
			return helper(root, sum, 0);
		}
	}
	
	public boolean helper(TreeNode node, int sum, int sumUptilNow) {
		
		if(node.left == null && node.right == null) {
			if(sum == (sumUptilNow + node.val)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			boolean leftResult = node.left != null ? helper(node.left, sum, (node.val + sumUptilNow)) : false;
			boolean rightResult = node.right != null ? helper(node.right, sum, (node.val + sumUptilNow)) : false;
			if(leftResult || rightResult) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
