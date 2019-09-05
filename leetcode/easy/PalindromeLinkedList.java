package easy;

import definition.ListNode;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(2);
//		head.next.next.next.next = new ListNode(1);
		
//		ListNode head = new ListNode(2);
//		head.next = new ListNode(3);
//		head.next.next = new ListNode(4);
//		head.next.next.next = new ListNode(5);
//		head.next.next.next.next = new ListNode(6);
//		head.next.next.next.next.next = new ListNode(7);
		
//		ListNode head = new ListNode(5);
		
//		ListNode head = new ListNode(10);
//		head.next = new ListNode(11);
		
//		ListNode head = new ListNode(11);
//		head.next = new ListNode(11);
		
//		ListNode head = null;
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		
		System.out.println(new PalindromeLinkedList().isPalindrome(head));
	}
	
    public boolean isPalindrome(ListNode head) {
    	
    	if(head == null) {
    		return true;
    	}
    	
    	ListNode midNode = head;
    	ListNode doubleJumpNode = head;
    	
    	while(doubleJumpNode.next != null && doubleJumpNode.next.next != null) {
    		midNode = midNode.next;
			doubleJumpNode = doubleJumpNode.next.next;
    	}
    	
    	ListNode firstHalfNode = head;
    	ListNode secondHalfNode = midNode.next;
    	secondHalfNode = reverseList(secondHalfNode);
    	
    	while(firstHalfNode != null && secondHalfNode != null) {
    		
    		if(firstHalfNode.val != secondHalfNode.val) {
    			return false;
    		}
    		else {
    			firstHalfNode = firstHalfNode.next;
    			secondHalfNode = secondHalfNode.next;
    		}
    	}
    	
    	return true;
    }
    
	public ListNode reverseList(ListNode head) {

		if(head == null) {
			return null;
		}
		else {
			ListNode prevNode = null;
			ListNode node = head;

			while(true) {
				ListNode nextNode = node.next;
				node.next = prevNode;
				prevNode = node;
				if(nextNode == null) {
					break;
				}
				else {
					node = nextNode;
				}
			}
			
			return node;
		}
	}
}
