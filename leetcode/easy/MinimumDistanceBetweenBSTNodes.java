package easy;

import java.util.ArrayList;

import definition.TreeNode;

public class MinimumDistanceBetweenBSTNodes {

	int minDiff = Integer.MAX_VALUE;

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode(4); 
		node.left = new TreeNode(2); 
		node.right = new TreeNode(6); 
		node.left.left = new TreeNode(1); 
		node.left.right = new TreeNode(3); 

		/*
		 * 					8
		 * 		4					13
		 * 2		7			11		15
		 */
//		TreeNode node = new TreeNode(8); 
//		node.left = new TreeNode(4); 
//		node.right = new TreeNode(13); 
//		node.left.left = new TreeNode(2); 
//		node.left.right = new TreeNode(7); 
//		node.right.left = new TreeNode(11); 
//		node.right.right = new TreeNode(15);
		
		/*
		 * 						12
		 * 			5					15
		 * 		2			8
		 * 				6		10
		 */
//		TreeNode node = new TreeNode(12);
//		node.left = new TreeNode(5);
//		node.right = new TreeNode(15);
//		node.left.left = new TreeNode(2);
//		node.left.right = new TreeNode(8);
//		node.left.right.left = new TreeNode(6);
//		node.left.right.right = new TreeNode(10);

		System.out.println(new MinimumDistanceBetweenBSTNodes().minDiffInBST(node));
	}
	
    public int minDiffInBST(TreeNode root) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	
    	getBSTinInorder(root, arr);
    	
    	int minVal = Integer.MAX_VALUE;
    	
    	for(int i=1; i<arr.size(); ++i) {
    		int tempVal = arr.get(i) - arr.get(i-1);
    		minVal = minVal > tempVal ? tempVal : minVal;
    	}
    	
    	return minVal;
    }
    
    public void getBSTinInorder(TreeNode root, ArrayList<Integer> arr) {
    	if(root != null) {
        	getBSTinInorder(root.left, arr);
        	arr.add(root.val);
        	getBSTinInorder(root.right, arr);
    	}
    }
}
