package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import definition.TreeNode;

public class BinaryTreeZigZagLevelOrderTraversal {

	public static void main(String[] args) {
		
//		TreeNode root = null;
		
//		TreeNode root = new TreeNode(4);
		
//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(9);
//		root.right = new TreeNode(20);
//		root.right.left = new TreeNode(15);
//		root.right.right = new TreeNode(7);
		
		TreeNode root = new TreeNode(9);
		root.left = new TreeNode(13);
		root.right = new TreeNode(18);
		
//		TreeNode root = new TreeNode(11);
//		root.left = new TreeNode(51);
//		root.right = new TreeNode(52);
//		root.left.left = new TreeNode(10);
//		root.left.right = new TreeNode(11);
//		root.right.left = new TreeNode(12);
//		root.right.right = new TreeNode(13);
//		root.left.left.left = new TreeNode(16);
//		root.left.left.right = new TreeNode(2);
//		root.right.left.left = new TreeNode(31);
//		root.right.right.right = new TreeNode(10);
//		root.right.left.left.left = new TreeNode(21);
//		root.right.left.left.right = new TreeNode(20);
		
		List<List<Integer>> lists = new BinaryTreeZigZagLevelOrderTraversal().zigzagLevelOrder(root);
		for(List<Integer> list : lists) {
			for(Integer val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		if(root == null) {
			return lists;
		}
		
		Queue<TreeNode> currentList = new LinkedList<TreeNode>();
		currentList.add(root);
		
		Queue<TreeNode> nextList = new LinkedList<TreeNode>();
		
		List<Integer> tempList = new ArrayList<Integer>();
		
		int direction = 1;
		
		while(!currentList.isEmpty()) {
			TreeNode node = currentList.poll();
			tempList.add(node.val);
			
			if(node.left != null) {
				nextList.add(node.left);
			}
			if(node.right != null) {
				nextList.add(node.right);
			}
			
			if(currentList.isEmpty()) {
				if(direction == 1) {
					lists.add(tempList);
				}
				else {
					List<Integer> tempList2 = new ArrayList<Integer>();
					for(int i=tempList.size()-1; i>=0; --i) {
						tempList2.add(tempList.get(i));
					}
					lists.add(tempList2);
				}
				currentList = nextList;
				nextList = new LinkedList<TreeNode>();
				tempList = new ArrayList<Integer>();
				direction *= -1;
			}
		}
		
		return lists;
	}
}
