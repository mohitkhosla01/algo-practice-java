package easy;

import definition.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(3);
//		l1.next.next = new ListNode(4);
//		ListNode l2 = new ListNode(1);
//		l2.next = new ListNode(2);
//		l2.next.next = new ListNode(4);
		
//		ListNode l1 = new ListNode(4);
//		l1.next = new ListNode(5);
//		l1.next.next = new ListNode(6);
//		ListNode l2 = new ListNode(1);
//		l2.next = new ListNode(2);
//		l2.next.next = new ListNode(3);
		
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(4);
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(7);
		
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(9);
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(7);
		
//		ListNode l1 = null;
//		ListNode l2 = null;
		
//		ListNode l1 = null;
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(7);
		
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(9);
//		ListNode l2 = null;
		
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);

		
		ListNode node = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	if(l1 == null && l2 == null) {
    		return null;
    	}
    	else if(l2 == null) {
    		return l1;
    	}
    	else if(l1 == null) {
    		return l2;
    	}
    	
    	ListNode node = null;
    	if(l1.val < l2.val) {
    		node = l1;
    		l1 = l1.next;
    	}
    	else {
    		node = l2;
    		l2 = l2.next;
    	}
    	ListNode head = node;
    	
    	while(l1 != null && l2 != null) {
    		if(l1.val < l2.val) {
    			node.next = l1;
    			l1 = l1.next;
    		}
    		else {
    			node.next = l2;
    			l2 = l2.next;
    		}
    		node = node.next;
    	}
    	
    	while(l1 != null) {
    		node.next = l1;
    		node = node.next;
    		l1 = l1.next;
    	}
    	
    	while(l2 != null) {
    		node.next = l2;
    		node = node.next;
    		l2 = l2.next;
    	}
    	
    	return head;
    }
}
