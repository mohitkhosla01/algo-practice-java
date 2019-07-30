package medium;

import java.util.ArrayList;

import definition.TreeNode;

public class ValidateBinarySearchTree {
	
	ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(2);
//		root.left = new TreeNode(1);
//		root.right = new TreeNode(3);
		
//		TreeNode root = new TreeNode(5);
//		root.left = new TreeNode(1);
//		root.right = new TreeNode(4);
//		root.right.left = new TreeNode(3);
//		root.right.right = new TreeNode(6);
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		
		System.out.println(new ValidateBinarySearchTree().isValidBST(root));
	}

	public boolean isValidBST(TreeNode root) {
		if(root == null) {
			return true;
		}
		else {
			helper(root);
			
			if(list.size() == 1) {
				return true;
			}
			else {
				for(int i=1; i<list.size(); ++i) {
					if(list.get(i) <= list.get(i-1)) {
						return false;
					}
				}
				return true;
			}
		}
	}
	
	public void helper(TreeNode node) {
		if(node.left != null) {
			helper(node.left);
		}
		
		list.add(node.val);
		
		if(node.right != null) {
			helper(node.right);
		}
	}
}
