package medium;

import definition.TreeNode;

public class InsertIntoABST {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(6);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(16);
		
		int val = 3;
		
		root = new InsertIntoABST().insertIntoBST(root, val);
		new InsertIntoABST().printInOrder(root);
	}
	
	public void printInOrder(TreeNode node) {
		
		if(node.left != null) {
			printInOrder(node.left);
		}
		System.out.print(node.val + " ");
		if(node.right != null) {
			printInOrder(node.right);
		}
	}

	public TreeNode insertIntoBST(TreeNode root, int val) {

		if(val > root.val) {
			if(root.right != null) {
				insertIntoBST(root.right, val);
			}
			else {
				root.right = new TreeNode(val);
				return root;
			}
		}
		else {
			if(root.left != null) {
				insertIntoBST(root.left, val);
			}
			else {
				root.left = new TreeNode(val);
				return root;
			}
		}
		
		return root;
	}
}
