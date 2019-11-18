package medium;

import definition.TreeNode;

public class LeastCommonAncestorOfABinaryTree {

	public static void main(String[] args) {
		
		TreeNode node01 = new TreeNode(0);
		TreeNode node11 = new TreeNode(1);
		TreeNode node21 = new TreeNode(2);
		TreeNode node31 = new TreeNode(3);
		TreeNode node41 = new TreeNode(4);
		TreeNode node51 = new TreeNode(5);
		TreeNode node61 = new TreeNode(6);
		TreeNode node71 = new TreeNode(7);
		TreeNode node81 = new TreeNode(8);
		
//		TreeNode root = node51;
//		root.right = node31;
		
		TreeNode root = node31;
		root.left = node51;
		root.right = node11;
		root.left.left = node61;
		root.left.right = node21;
		root.right.left = node01;
		root.right.right = node81;
		root.left.right.left = node71;
		root.left.right.right = node41;
		
		TreeNode p = node61;
		TreeNode q = node81;
		
		TreeNode lcaNode = new LeastCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q);
		System.out.println(lcaNode.val);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if (root == null || root == p || root == q) {
			return root;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if (left != null && right != null) {
			return root;
		}
		return left != null ? left : right;
	}
}
