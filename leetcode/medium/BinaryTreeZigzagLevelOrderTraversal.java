package medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import definition.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		//		TreeNode root = new TreeNode(2);
		//		root.left = new TreeNode(5);
		//		root.right = new TreeNode(20);
		//		root.left.left = new TreeNode(4);
		//		root.left.right = new TreeNode(8);
		//		root.right.left = new TreeNode(15);
		//		root.right.right = new TreeNode(12);
		//		root.left.left.left = new TreeNode(1);
		//		root.left.left.right = new TreeNode(3);
		//		root.left.right.left = new TreeNode(9);
		//		root.left.right.right = new TreeNode(7);

		//		TreeNode root = new TreeNode(2);

		//		TreeNode root = new TreeNode(5);
		//		root.left = new TreeNode(6);
		//		root.right = new TreeNode(7);
		//		root.left.left = new TreeNode(10);
		//		root.left.right = new TreeNode(3);
		//		root.right.left = new TreeNode(20);
		//		root.right.right = new TreeNode(8);
		//		root.left.left.left = new TreeNode(2);
		//		root.left.left.right = new TreeNode(9);
		//		root.left.right.left = new TreeNode(11);
		//		root.left.right.right = new TreeNode(12);
		//		root.right.right.left = new TreeNode(15);
		//		root.right.right.right = new TreeNode(16);

		//		TreeNode root = null;

		List<List<Integer>> numLists = new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root);

		for(List<Integer> numList : numLists) {
			for(Integer num : numList) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<Integer>> finalLists = new ArrayList<List<Integer>>();

		if(root != null) {

			List<TreeNode> currentList = null;
			List<TreeNode> nextLevelList = new ArrayList<TreeNode>();
			nextLevelList.add(root);

			int direction = 1;

			while(!nextLevelList.isEmpty()) {

				currentList = nextLevelList;
				nextLevelList = new ArrayList<TreeNode>();

				List<Integer> listToBeAdded = new ArrayList<Integer>();

				Iterator<TreeNode> it = currentList.iterator();
				while(it.hasNext()) {
					TreeNode node = it.next();
					listToBeAdded.add(node.val);
					if(node.left != null) {
						nextLevelList.add(node.left);
					}
					if(node.right != null) {
						nextLevelList.add(node.right);
					}
				}

				if(direction == 1) {
					finalLists.add(listToBeAdded);
				}
				else {
					List<Integer> listToBeAdded2 = new ArrayList<Integer>();

					for(int i=listToBeAdded.size() - 1; i>=0; --i) {
						listToBeAdded2.add(listToBeAdded.get(i));
					}

					finalLists.add(listToBeAdded2);
				}

				direction *= -1;
			}
		}

		return finalLists;
	}
}
