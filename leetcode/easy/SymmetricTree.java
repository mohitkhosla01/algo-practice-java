package easy;

import definition.TreeNode;

public class SymmetricTree {

	public static void main(String[] args) {
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(4);
//		root.right = new TreeNode(2);
//		root.right.left = new TreeNode(4);
//		root.right.right = new TreeNode(3);
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.left.right = new TreeNode(3);
//		root.right = new TreeNode(2);
//		root.right.right = new TreeNode(3);
		
//		TreeNode root = new TreeNode(0);
		
//		TreeNode root = new TreeNode(40);
//		root.left = new TreeNode(80);
//		root.right = new TreeNode(80);
		
//		TreeNode root = null;
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(0);
		
//		TreeNode root = new TreeNode(2);
//		root.left = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
//		root.right = new TreeNode(3);
//		root.right.left = null;
//		root.right.right = new TreeNode(4);
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(2);
		root.left.right = null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(2);
		
		System.out.println(new SymmetricTree().isSymmetric(root));
	}

	public boolean isSymmetric(TreeNode root) {
		
		if(root == null) {
			return true;
		}
		else if(root.left == null && root.right == null) {
			return true;
		}
		else if(root.left != null && root.right == null) {
			return false;
		}
		else if(root.left == null && root.right != null) {
			return false;
		}
		else {
			return helper(root.left, root.right);
		}
	}

	
	public boolean helper(TreeNode leftNode, TreeNode rightNode) {
		
		if(leftNode.val != rightNode.val) {
			return false;
		}
		
		if(leftNode.left != null && rightNode.right == null) {
			return false;
		}
		else if(leftNode.left == null && rightNode.right != null) {
			return false;
		}
		else if(leftNode.left != null && rightNode.right != null) {
			boolean symmetryOuter = helper(leftNode.left, rightNode.right);
			if(symmetryOuter == false) {
				return false;
			}
		}
		
		if(leftNode.right != null && rightNode.left == null) {
			return false;
		}
		else if(leftNode.right == null && rightNode.left != null) {
			return false;
		}
		else if(leftNode.right != null && rightNode.left != null) {
			boolean symmetryInner = helper(leftNode.right, rightNode.left);
			if(symmetryInner == false) {
				return false;
			}
		}
		
		return true;
	}
}
