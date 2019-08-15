package easy;

import definition.TreeNode;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.left.left = new TreeNode(16);
		root.left.right = new TreeNode(1);
		root.left.left.left = new TreeNode(2);
		root.left.left.right = new TreeNode(3);
		root.left.right.left = new TreeNode(32);
		root.left.right.right = new TreeNode(33);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		root.right.left.left = new TreeNode(22);
		root.right.left.right = new TreeNode(23);
		root.right.right.left = new TreeNode(32);
		root.right.right.right = new TreeNode(33);

		//	TreeNode root = new TreeNode(1);
		//	root.left = new TreeNode(2);

		System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));
	}

	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else {
			return helper(root, 1);
		}
	}

	public int helper(TreeNode node, int level) {
		int maxLevel = Integer.MIN_VALUE;

		if(node.left == null && node.right == null) {
			return level;
		}

		if(node.left != null) {
			int tempLevel = helper(node.left, level+1);
			if(tempLevel > maxLevel) {
				maxLevel = tempLevel;
			}
		}
		if(node.right != null) {
			int tempLevel = helper(node.right, level+1);
			if(tempLevel > maxLevel) {
				maxLevel = tempLevel;
			}
		}

		return maxLevel;
	}
}
