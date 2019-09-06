package easy;

import definition.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		
		ConvertSortedArrayToBinarySearchTree obj = new ConvertSortedArrayToBinarySearchTree();
		
		// int[] nums = {-10,-3,0,5,9};
		// int[] nums = {2,6,7,8,9,10,12};
		// int[] nums = {1};
		// int[] nums = {1,2,3};
		int[] nums = {};
		
		TreeNode head = obj.sortedArrayToBST(nums);
		
		obj.printTreeInOrder(head);
	}
	
    public TreeNode sortedArrayToBST(int[] nums) {
    	
    	if(nums.length == 0) {
    		return null;
    	}
    	else {
        	int[] numsVisited = new int[nums.length];
        	TreeNode head = helper(nums, numsVisited, 0, nums.length);
        	
        	return head;
    	}
    }
    
    public TreeNode helper(int[] nums, int[] numsVisited, int leftIndex, int rightIndex) {
    	
    	int index = (leftIndex + rightIndex) / 2;
    	
    	if(numsVisited[index] != -1) {
    		numsVisited[index] = -1;
        	TreeNode node = new TreeNode(nums[index]);
        	if(leftIndex != index) {
        		node.left = helper(nums, numsVisited, leftIndex, index);
        	}
        	if((rightIndex - index) != 1) {
        		node.right = helper(nums, numsVisited, index, rightIndex);
        	}
        	return node;
    	}
    	else {
    		return null;
    	}
    }
    
	public void printTreeInOrder(TreeNode node) {
		
		if(node != null) {
			printTreeInOrder(node.left);
			System.out.print(node.val + " ");
			printTreeInOrder(node.right);
		}
	}
}
