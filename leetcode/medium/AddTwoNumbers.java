package medium;

import definition.ListNode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(9);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode sumList = new AddTwoNumbers().addTwoNumbers(l1, l2);
		while(sumList != null) {
			System.out.print(sumList.val + " ");
			sumList = sumList.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode sumList = new ListNode(0);
		ListNode head = sumList;
		int carry = 0;
		
		while(l1 != null && l2 != null) {
			sumList.next = new ListNode((l1.val + l2.val + carry) % 10);
			carry = (l1.val + l2.val + carry) / 10;
			
			sumList = sumList.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		while(l1 != null) {
			sumList.next = new ListNode((l1.val + carry) % 10);
			carry = (l1.val + carry) / 10;
			
			sumList = sumList.next;
			l1 = l1.next;
		}
		
		while(l2 != null) {
			sumList.next = new ListNode((l2.val + carry) % 10);
			carry = (l2.val + carry) / 10;
			
			sumList = sumList.next;
			l2 = l2.next;
		}
		
		if(carry != 0) {
			sumList.next = new ListNode(carry);
		}
		
		return head.next;
	}
}
