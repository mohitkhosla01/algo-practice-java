package medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import definition.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		
//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(9);
//		root.right = new TreeNode(20);
//		root.right.left = new TreeNode(15);
//		root.right.right = new TreeNode(7);
		
//		TreeNode root = new TreeNode(2);
//		root.left = new TreeNode(5);
//		root.left.left = new TreeNode(4);
//		root.left.left.left = new TreeNode(1);
//		root.left.left.right = new TreeNode(3);
//		root.left.right = new TreeNode(8);
//		root.left.right.left = new TreeNode(9);
//		root.left.right.right = new TreeNode(7);
//		root.right = new TreeNode(20);
//		root.right.left = new TreeNode(15);
//		root.right.right = new TreeNode(12);
		
//		TreeNode root = new TreeNode(2);
		
		TreeNode root = null;
		
		
		List<List<Integer>> numLists = new BinaryTreeLevelOrderTraversal().levelOrder(root);
		for(List<Integer> numList : numLists) {
			for(Integer num : numList) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> nodeLists = new ArrayList<List<Integer>>();

		if(root != null) {
			List<TreeNode> currentList = null;
			
			List<TreeNode> nextList = new ArrayList<TreeNode>();
			nextList.add(root);
			
			do {
				currentList = nextList;
				nextList = new ArrayList<TreeNode>();
				
				List<Integer> finalList = new ArrayList<Integer>();
				
				Iterator<TreeNode> it = currentList.iterator();
				
				while(it.hasNext()) {
					TreeNode node = it.next();
					
					finalList.add(node.val);
					if(node.left != null) {
						nextList.add(node.left);
					}
					if(node.right != null) {
						nextList.add(node.right);
					}
				}
				
				nodeLists.add(finalList);
				
			} while(!nextList.isEmpty());
		}
		
		return nodeLists;
	}
}
