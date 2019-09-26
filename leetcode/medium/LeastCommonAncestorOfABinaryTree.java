package medium;

import java.util.ArrayList;
import java.util.List;

import definition.TreeNode;

public class LeastCommonAncestorOfABinaryTree {

	public static void main(String[] args) {

//		TreeNode root = new TreeNode(9);
//		root.left = new TreeNode(5);
//		root.right = new TreeNode(1);
//		root.left.left = new TreeNode(6);
//		root.left.right = new TreeNode(2);
//		root.right.left = new TreeNode(0);
//		root.right.right = new TreeNode(8);
//		root.left.right.left = new TreeNode(7);
//		root.left.right.right = new TreeNode(4);
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		
		TreeNode p = new TreeNode(5);
		TreeNode q = new TreeNode(4);
		
		TreeNode lcaNode = new LeastCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q);
		System.out.println(lcaNode.val);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		List<TreeNode> aNodes = new ArrayList<TreeNode>();
		List<TreeNode> bNodes = new ArrayList<TreeNode>();
		TreeNode common = null;

		helper(root, p, aNodes);
		helper(root, q, bNodes);
		int i = aNodes.size()-1;
		int j = bNodes.size()-1;
		common = aNodes.get(aNodes.size()-1);

		while(i>=0 && j>=0) {
			if(aNodes.get(i) == bNodes.get(j)) {
				common = aNodes.get(i);
				--i;
				--j;
			}
			else {
				break;
			}
		}
		return common;
	}

	public boolean helper(TreeNode node, TreeNode x, List<TreeNode> nodes) {

		if(node == null) {
			return false;
		}
		else if(node.val == x.val) {
			nodes.add(node);
			return true;
		}
		else {
			boolean leftResult = helper(node.left, x, nodes);
			boolean rightResult = helper(node.right, x, nodes);
			if(leftResult || rightResult) {
				nodes.add(node);
				return true;
			}
			else {
				return false;
			}
		}
	}
}
