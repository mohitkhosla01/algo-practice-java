package easy;

import definition.ListNode;

public class DeleteNodeInALinkedList {

	public static void main(String[] args) {
		
//		ListNode head = new ListNode(4);
//		head.next = new ListNode(5);
//		head.next.next = new ListNode(1);
//		head.next.next.next = new ListNode(9);
		
		ListNode head = new ListNode(8);
		head.next = new ListNode(2);
		head.next.next = new ListNode(5);
		head.next.next.next = new ListNode(6);
		
		new DeleteNodeInALinkedList().deleteNode(head);
		
		ListNode iteratingNode = head;
		while(iteratingNode != null) {
			System.out.print(iteratingNode.val + " ");
			iteratingNode = iteratingNode.next;
		}
	}
	
    public void deleteNode(ListNode node) {
    	int tempVal = node.next.val;
    	node.next = node.next.next;
        node.val = tempVal;
    }
}
