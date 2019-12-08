package linkedlists;

import definition.ListNode;

public class MergeSort {

	public static void main(String[] args) {

//		ListNode head = null;
		
//		ListNode head = new ListNode(5);

//		ListNode head = new ListNode(3);
//		head.next = new ListNode(6);
		
//		ListNode head = new ListNode(8);
//		head.next = new ListNode(6);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(7);
//		head.next.next.next.next = new ListNode(2);
		
		ListNode head = new ListNode(8);
		head.next = new ListNode(6);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(7);
		head.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next.next = new ListNode(9);

		
		ListNode sortedList = mergeSort(head);
		while(sortedList != null) {
			System.out.print(sortedList.val + " ");
			sortedList = sortedList.next;
		}
		System.out.println();
	}

	static ListNode mergeSort(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}

		ListNode fast = head;
		ListNode slow = head;

		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode list2 = slow.next;
		ListNode list1 = head;
		slow.next = null;

		ListNode left = mergeSort(list1);
		ListNode right = mergeSort(list2);

		ListNode sortedList = merge(left, right);
		return sortedList;
	}
	
	static ListNode merge(ListNode left, ListNode right) {
		if(left == null) {
			return right;
		}
		if(right == null) {
			return left;
		}
		
		ListNode head = null;
		
		if(left.val < right.val) {
			head = left;
			head.next = merge(left.next, right);
		}
		else {
			head = right;
			head.next = merge(left, right.next);
		}
		
		return head;
	}
}
