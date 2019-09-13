package easy;

import definition.TreeNode;

public class SearchInABinarySearchTree {

	public static void main(String[] args) {
		
		SearchInABinarySearchTree obj = new SearchInABinarySearchTree();
		
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(7);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
		
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(7);
//		root.right.left = new TreeNode(1);
//		root.right.right = new TreeNode(3);
		
//		TreeNode root = new TreeNode(8);
//		root.left = new TreeNode(1);
//		root.right = new TreeNode(7);
//		root.right.left = new TreeNode(1);
//		root.right.right = new TreeNode(3);
		
//		TreeNode root = new TreeNode(10);
		
		TreeNode root = null;
		
//		int val = 2;
//		int val = 5;
		int val = 0;
		
		TreeNode node = obj.searchBST(root, val);
		obj.printPreorder(node);
	}
	
	public void printPreorder(TreeNode node) {
		
		if(node != null) {
			System.out.print(node.val + " ");
			if(node.left != null) {
				printPreorder(node.left);
			}
			if(node.right != null) {
				printPreorder(node.right);
			}
		}
	}

	public TreeNode searchBST(TreeNode root, int val) {
		
		if(root == null) {
			return null;
		}
		else {
			return helper(root, val);
		}
	}
	
	public TreeNode helper(TreeNode node, int val) {
		
		if(node == null) {
			return null;
		}
		if(node.val == val) {
			return node;
		}
		else if(node.val > val) {
			return helper(node.left, val);
		}
		else {
			return helper(node.right, val);
		}
	}
}
