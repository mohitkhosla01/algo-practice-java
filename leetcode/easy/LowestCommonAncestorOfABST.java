package easy;

import java.util.ArrayList;

import definition.TreeNode;

public class LowestCommonAncestorOfABST {

	ArrayList<TreeNode> pHS = new ArrayList<TreeNode>();
	ArrayList<TreeNode> qHS = new ArrayList<TreeNode>();
	boolean pFlag = false;
	boolean qFlag = false;

	public static void main(String[] args) {

		TreeNode node = new TreeNode(6);
		node.left = new TreeNode(2);
		node.right = new TreeNode(8);
		node.left.left = new TreeNode(0);
		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(7);
		node.right.right = new TreeNode(9);
		node.left.right.left = new TreeNode(3);
		node.left.right.right = new TreeNode(5);

		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(8);

		System.out.println(new LowestCommonAncestorOfABST().lowestCommonAncestor(node, p, q).val);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		findPAncestor(root, p, q);
		findQAncestor(root, p, q);

		for(int i=0; i<pHS.size(); ++i) {
			for(int j=0; j<qHS.size(); ++j) {
				if(pHS.get(i).val == qHS.get(j).val) {
					return pHS.get(i);
				}
			}
		}
		return new TreeNode(-1);
	}

	public void findPAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) {
			return;
		}

		if(root.val == p.val) {
			pFlag = true;
			pHS.add(root);
			return;
		}

		if(!pFlag) {
			findPAncestor(root.left, p, q);
		}
		if(!pFlag) {
			findPAncestor(root.right, p, q);
		}

		if(pFlag) {
			pHS.add(root);
			return;
		}
	}

	public void findQAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) {
			return;
		}

		if(root.val == q.val) {
			qFlag = true;
			qHS.add(root);
			return;
		}

		if(!qFlag) {
			findQAncestor(root.left, p, q);
		}

		if(!qFlag) {
			findQAncestor(root.right, p, q);
		}

		if(qFlag) {
			qHS.add(root);
			return;
		}
	}
}
