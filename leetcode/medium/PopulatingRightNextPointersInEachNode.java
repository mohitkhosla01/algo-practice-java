package medium;

import java.util.ArrayList;
import java.util.List;

public class PopulatingRightNextPointersInEachNode {
	
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};

	public Node connect(Node root) {
		if (root == null) {
			return root;
		}

		Node rootCopy = root;
		helper(root, new ArrayList<Node>(), 0);

		return rootCopy;
	}

	public void helper(Node node, List<Node> levelNodes, int level) {

		if (levelNodes.size() >= (level + 1) && levelNodes.get(level) != null) {
			levelNodes.get(level).next = node;
		}

		if (levelNodes.size() < (level + 1)) {
			levelNodes.add(node);
		}
		else {
			levelNodes.set(level, node);
		}

		if (node.left != null) {
			helper(node.left, levelNodes, level + 1);
		}
		if (node.right != null) {
			helper(node.right, levelNodes, level + 1);
		}
	}
}
