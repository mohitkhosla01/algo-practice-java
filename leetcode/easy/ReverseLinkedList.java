package easy;

import definition.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {

			ListNode head = new ListNode(1);
			head.next = new ListNode(2);
			head.next.next = new ListNode(3);
			head.next.next.next = new ListNode(4);
			head.next.next.next.next = new ListNode(5);

		// ListNode head = null;
		
		// ListNode head = new ListNode(8);
		// head.next = new ListNode(9);
		
		// ListNode head = new ListNode(20);

		ListNode node = new ReverseLinkedList().reverseList(head.next.next);

		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
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
