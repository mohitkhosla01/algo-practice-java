package medium;

import java.util.ArrayList;
import java.util.List;

import definition.TreeNode;

public class PathSumII {

	public static void main(String[] args) {
		
//		TreeNode root = null;
		
//		TreeNode root = new TreeNode(10);
		
		TreeNode root = new TreeNode(22);
		
//		TreeNode root = new TreeNode(5);
//		root.left = new TreeNode(4);
//		root.right = new TreeNode(8);
//		root.left.left = new TreeNode(11);
//		root.right.left = new TreeNode(13);
//		root.right.right = new TreeNode(4);
//		root.left.left.left = new TreeNode(7);
//		root.left.left.right = new TreeNode(2);
//		root.right.right.left = new TreeNode(5);
//		root.right.right.right = new TreeNode(1);
		
		int sum = 22;
		
		List<List<Integer>> lists = new PathSumII().pathSum(root, sum);
		
		for(List<Integer> list : lists) {
			for(Integer val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();

		if(root != null) {
			helper(root, sum, lists, new ArrayList<Integer>(), 0);
		}
		
		return lists;
	}

	public void helper(TreeNode node, int sum, List<List<Integer>> lists, List<Integer> currentList, int currentSum) {

		currentList.add(node.val);
		currentSum += node.val;

		if(node.left == null && node.right == null) {
			if(sum == currentSum) {
				List<Integer> copyList = new ArrayList<Integer>();
				for(Integer val : currentList) {
					copyList.add(val);
				}
				lists.add(copyList);
			}
		}
		else {
			if(node.left != null) {
				helper(node.left, sum, lists, currentList, currentSum);
			}
			if(node.right != null) {
				helper(node.right, sum, lists, currentList, currentSum);
			}
		}

		currentSum -= node.val;
		currentList.remove(currentList.size()-1);
	}
}
