package medium;

import definition.TreeNode;

public class ConstructBinaryTreeFromPreorderInorder {

	public static void main(String[] args) {
		
//		int[] preorder = {3,9,20,15,7};
//		int[] inorder = {9,3,15,20,7};
		
//		int[] preorder = {21,20,18,15,27,29,19,24,23};
//		int[] inorder = {18,20,27,15,29,21,24,19,23};
		
//		int[] preorder = {};
//		int[] inorder = {};
		
//		int[] preorder = {1,2,3};
//		int[] inorder = {1,2,3};
		
//		int[] preorder = {5};
//		int[] inorder = {5};
		
//		int[] preorder = {5,1};
//		int[] inorder = {1,5};
		
		int[] preorder = {1,2,3};
		int[] inorder = {3,2,1};
		
		TreeNode root = new ConstructBinaryTreeFromPreorderInorder().buildTree(preorder, inorder);
		System.out.print("Preorder: ");
		new ConstructBinaryTreeFromPreorderInorder().printTreePreOrder(root);
		System.out.print("\nInorder: ");
		new ConstructBinaryTreeFromPreorderInorder().printTreeInOrder(root);
	}
	
	public void printTreePreOrder(TreeNode node) {
		
		if(node != null) {
			System.out.print(node.val + " ");
			printTreePreOrder(node.left);
			printTreePreOrder(node.right);
		}
	}
	
	public void printTreeInOrder(TreeNode node) {
		
		if(node != null) {
			printTreeInOrder(node.left);
			System.out.print(node.val + " ");
			printTreeInOrder(node.right);
		}
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		if(preorder.length == 0 || inorder.length == 0 || (preorder.length != inorder.length)) {
			return null;
		}
		else {
			TreeNode root = new TreeNode(preorder[0]);
			
			TreeNode currentRoot = root;
			
			String leftDirection = "left", rightDirection = "right";
			String direction = leftDirection;
			
			for(int i=1; i<preorder.length; ++i) {
				
				int rootIndex = -1, childIndex = -1;
				
				for(int j=0; j<inorder.length; ++j) {
					if(inorder[j] == currentRoot.val) {
						rootIndex = j;
					}
					if(inorder[j] == preorder[i]) {
						childIndex = j;
					}
				}
				
				if(childIndex < rootIndex) {
					currentRoot.left = new TreeNode(preorder[i]);
					direction = leftDirection;
				}
				else {
					currentRoot.right = new TreeNode(preorder[i]);
					direction = rightDirection;
				}
				
				if(((childIndex + 1) < inorder.length) && (root.val == inorder[childIndex + 1])) {
					currentRoot = root;
					direction = rightDirection;
				}
				if(((childIndex + 1) < inorder.length) && (currentRoot.val == inorder[childIndex + 1])) {
					direction = rightDirection;
				}
				else if(childIndex != 0) {
					if(direction == leftDirection) {
						currentRoot = currentRoot.left;
					}
					else {
						currentRoot = currentRoot.right;
					}
				}
			}
			
			return root;
		}
	}
}
