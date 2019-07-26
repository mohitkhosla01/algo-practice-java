package medium;

import definition.ListNode;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(2);
		node.next.next.next.next = new ListNode(4);
		node.next.next.next.next.next = new ListNode(4);
		node.next.next.next.next.next.next = new ListNode(4);
		node.next.next.next.next.next.next.next = new ListNode(7);

		//		ListNode node = new ListNode(1);
		//		node.next = new ListNode(1);
		//		node.next.next = new ListNode(1);

		node = new RemoveDuplicatesFromSortedListII().deleteDuplicates(node);
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
			ListNode lastNode = null;

			while(node.next != null) {
				if(node.val == node.next.val) {
					if(node.next.next == null) {
						if(lastNode == null) {
							head = null;
						}
						else {
							lastNode.next = null;
							node = lastNode;
						}
						break;
					}
					else {
						if(node.val == node.next.next.val) {
							node.next = node.next.next;
						}
						else {
							if(lastNode == null) {
								head = node.next.next;
								node = head;
								lastNode = null;
							}
							else {
								lastNode.next = node.next.next;
								node = lastNode;
							}
						}
					}
				}
				else {
					lastNode = node;
					node = node.next;
				}
			}

			return head;
		}
	}
}
