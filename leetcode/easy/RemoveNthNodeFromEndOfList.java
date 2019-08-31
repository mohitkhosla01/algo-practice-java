package easy;

import java.util.ArrayList;
import java.util.List;

import definition.ListNode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
//		int n = 2;
		
//		ListNode head = new ListNode(4);
//		head.next = new ListNode(5);
//		head.next.next = new ListNode(1);
//		head.next.next.next = new ListNode(9);
//		int n = 4;
		
//		ListNode head = null;
//		int n = 4;
		
//		ListNode head = new ListNode(7);
//		int n = 4;
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		int n = 8;
		
		ListNode node = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, n);
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	
    	if(head == null) {
    		return null;
    	}
    	else {
        	ListNode node = head;
        	List<ListNode> nodeList = new ArrayList<ListNode>();
        	
        	while(node != null) {
        		nodeList.add(node);
        		node = node.next;
        	}
            
        	if(nodeList.size() < n) {
        		return head;
        	}
        	if(nodeList.size() == n) {
        		return head.next;
        	}
        	else {
            	nodeList.get(nodeList.size() - n - 1).next = nodeList.get(nodeList.size() - n - 1).next.next;
            	return head;
        	}
    	}
    }
}
