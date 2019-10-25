package medium;

import java.util.ArrayList;
import java.util.List;

import definition.TreeNode;

public class MaximumLevelSumOfBinaryTree {

	public static void main(String[] args) {
		
		MaximumLevelSumOfBinaryTree obj = new MaximumLevelSumOfBinaryTree();
		
//		TreeNode node = new TreeNode(1);
//		node.left = new TreeNode(7);
//		node.right = new TreeNode(0);
//		node.left.left = new TreeNode(7);
//		node.left.right = new TreeNode(-8);
		
//		TreeNode node = new TreeNode(1);
//		node.left = new TreeNode(7);
//		node.right = new TreeNode(0);
//		node.left.left = new TreeNode(7);
//		node.left.right = new TreeNode(8);
		
//		TreeNode node = new TreeNode(1);
//		node.left = new TreeNode(7);
//		node.right = new TreeNode(18);
//		node.left.left = new TreeNode(7);
//		node.left.right = new TreeNode(8);
		
//		TreeNode node = new TreeNode(29);
//		node.left = new TreeNode(7);
//		node.right = new TreeNode(18);
//		node.left.left = new TreeNode(7);
//		node.left.right = new TreeNode(8);
		
//		TreeNode node = null;
		
		TreeNode node = new TreeNode(29);
		
		System.out.println(obj.maxLevelSum(node));
	}

	public int maxLevelSum(TreeNode root) {
		
		List<Integer> levelSums = new ArrayList<Integer>();
		helper(root, levelSums, 1);
		
		int maxSum = 0;
		int maxSumLevel = -1;
		for(int i=0; i<levelSums.size(); ++i) {
			if(levelSums.get(i) > maxSum) {
				maxSum = levelSums.get(i);
				maxSumLevel = i;
			}
		}
		
		return maxSumLevel + 1;
	}
	
	public void helper(TreeNode node, List<Integer> levelSums, int level) {
		
		if(node != null) {
			if(levelSums.size() < level) {
				levelSums.add(0);
			}
			levelSums.set(level-1, levelSums.get(level-1) + node.val);
			
			helper(node.left, levelSums, level+1);
			helper(node.right, levelSums, level+1);
		}
	}
}
