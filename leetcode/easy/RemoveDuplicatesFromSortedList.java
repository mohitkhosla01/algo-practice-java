package easy;

import definition.ListNode;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(3);
		
//		ListNode node = new ListNode(1);
//		node.next = new ListNode(1);
//		node.next.next = new ListNode(1);
		
		node = new RemoveDuplicatesFromSortedList().deleteDuplicates(node);
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return head;
		}
		else {
			ListNode node = head;
			
			while(node.next != null) {
				if(node.val == node.next.val) {
					node.next = node.next.next;
				}
				else {
					node = node.next;
				}
			}
			
			return head;
		}
	}
}
