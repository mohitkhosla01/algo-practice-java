package hard;

import java.util.PriorityQueue;
import java.util.Queue;

import definition.ListNode;

public class MergeKSortedLists {

	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] lists) {
		
		if(lists == null || lists.length == 0) {
			return null;
		}

		Queue<ListNode> elements = new PriorityQueue<ListNode>(lists.length, (a,b) -> a.val-b.val);
		
		for(int i=0; i<lists.length; ++i) {
			if(lists[i] != null) {
				elements.add(lists[i]);
			}
		}
		
		ListNode head = elements.poll();
		if(head == null) {
			return null;
		}
		
		if(head.next != null) {
			elements.add(head.next);
		}
		
		if(elements.size() > 0) {
			
		}
		ListNode node = head;
		
		while(!elements.isEmpty()) {
			ListNode tempNode = elements.poll();
			if(tempNode.next != null) {
				elements.add(tempNode.next);
			}
			
			node.next = tempNode;
			node = node.next;
		}
		
		return head;
	}
}
