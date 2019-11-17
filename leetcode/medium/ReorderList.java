package medium;

import definition.ListNode;

public class ReorderList {

	public static void main(String[] args) {
		
//		ListNode head = null;
		
//		ListNode head = new ListNode(1);
		
//		ListNode head = new ListNode(10);
//		head.next = new ListNode(11);
		
//		ListNode head = new ListNode(20);
//		head.next = new ListNode(21);
//		head.next.next = new ListNode(22);
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next = new ListNode(6);
//		head.next.next.next.next.next.next = new ListNode(7);
		
		new ReorderList().reorderList(head);
		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	public void reorderList(ListNode head) {
		
		if(head != null && head.next != null) {
			
			ListNode slow = head;
			ListNode fast = head;
			
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			ListNode head1 = head;
			ListNode head2 = slow.next;
			slow.next = null;
			
			head2 = reverse(head2);
			
			while(head2 != null) {
				ListNode head1next = head1.next;
				ListNode head2next = head2.next;
				head1.next = head2;
				head1.next.next = head1next;
				head2 = head2next;
				head1 = head1.next.next;
			}
		}
	}
	
	public ListNode reverse(ListNode head) {
		
		ListNode prev = null;
		ListNode node = head;
		ListNode next = null;
		
		while(node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		
		return prev;
	}
}
