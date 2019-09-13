package easy;

import definition.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(4);
		
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(4);
//		
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(7);
		
		ListNode node = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    	ListNode head = l1;
    	
    	while(l1.next != null && l2.next != null) {
    		if((l1.val == l2.val) || (l1.next != null && l1.next.val > l2.val)) {
    			System.out.println("1st if " + l1.val + " " + l2.val);
    			ListNode l1copy = l1;
    			ListNode l2next = l2.next;
    			l1 = l2;
    			l1.next = l1copy;
    			l2 = l2next;
    		}
    		else if(l1.next != null && l1.next.val > l2.val) {
    			System.out.println("2nd if " + l1.val + " " + l2.val);
    			ListNode l1next = l1.next;
    			ListNode l2next = l2.next;
    			l1.next = l2;
    			l2.next = l1next;
    			l1 = l2;
    			l2 = l2next;
    		}
    		else if(l1.next != null) {
    			System.out.println("3rd if " + l1.val + " " + l2.val);
    			l1 = l1.next;
    		}
    	}

    	if(l2 != null) {
    		l1 = l2;
    	}
    	
    	return head;
    }
}
