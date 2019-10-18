package easy;

import definition.TreeNode;

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {

		MergeTwoBinaryTrees obj = new MergeTwoBinaryTrees();
		
//		TreeNode t1 = null;
//		TreeNode t2 = null;
		
//		TreeNode t1 = null;
//		TreeNode t2 = new TreeNode(5);
		
//		TreeNode t1 = new TreeNode(10);
//		
//		TreeNode t2 = new TreeNode(5);
//		t2.left = new TreeNode(3);
//		t2.right = new TreeNode(2);

		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);

		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);

		obj.printBSTElement(obj.mergeTrees(t1, t2));
	}

	public void printBSTElement(TreeNode t) {
		if(t != null) {
			printBSTElement(t.left);
			System.out.print(t.val + " ");
			printBSTElement(t.right);
		}
	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) {
			return t2;
		}
		else if(t2 == null) {
			return t1;
		}
		else {
			t1.val = t1.val + t2.val;
			t1.left = mergeTrees(t1.left, t2.left);
			t1.right = mergeTrees(t1.right, t2.right);
			
			return t1;
		}
	}
}
