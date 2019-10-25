package algorithms;

import java.util.ArrayList;
import java.util.List;

import definition.TreeNode;

/* The aim is to check if a certain node exists in a binary tree, and then print all nodes of the same level.
 * If no nodes exist, then print nothing.
 */

public class FindNodeInABinaryTreeAndPrintSameLevelNodes {

	public static void main(String[] args) {
		
		FindNodeInABinaryTreeAndPrintSameLevelNodes obj = new FindNodeInABinaryTreeAndPrintSameLevelNodes();
		
		TreeNode node = new TreeNode(34);
		node.left = new TreeNode(35);
		node.right = new TreeNode(78);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(5);
		node.right.left = new TreeNode(13);
		node.right.right = new TreeNode(21);
		node.left.left.left = new TreeNode(17);
		node.left.left.right = new TreeNode(15);
		node.left.right.left = new TreeNode(23);
		node.left.right.right = new TreeNode(49);
		node.right.right.left = new TreeNode(1);
		node.right.right.right = new TreeNode(11);
		
		// int val = 3;
		// int val = 78;
		int val = 49;
		
		List<Integer> nodeVals = obj.levelNodes(node, val);
		for(Integer nodeVal : nodeVals) {
			System.out.print(nodeVal + " ");
		}
	}
	
	public List<Integer> levelNodes(TreeNode node, int val) {
		
		TreeNode node2 = node;
		int level = findLevel(node2, val, 1);
		if(level == 0) {
			return null;
		}
		
		List<Integer> nodeVals = new ArrayList<Integer>();
		getAllLevelNodes(node, nodeVals, 1, level);
		
		return nodeVals;
	}

	public Integer findLevel(TreeNode node, int val, int level) {
		
		if(node == null) {
			return 0;
		}
		else if(node.val == val) {
			return level;
		}
		else {
			int leftLevel = findLevel(node.left, val, level+1);
			if(leftLevel != 0) {
				return leftLevel;
			}
			
			int rightLevel = findLevel(node.right, val, level+1);
			if(rightLevel != 0) {
				return rightLevel;
			}
			
			return 0;
		}
	}
	
	public void getAllLevelNodes(TreeNode node, List<Integer> nodeVals, int currentLevel, int level) {
		
		if(currentLevel == level) {
			nodeVals.add(node.val);
		}
		else {
			if(node.left != null) {
				getAllLevelNodes(node.left, nodeVals, currentLevel+1, level);
			}
			if(node.right != null) {
				getAllLevelNodes(node.right, nodeVals, currentLevel+1, level);
			}
		}
	}
}
