package easy;

import java.util.HashSet;
import java.util.Set;

import definition.ListNode;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		
		ListNode node41 = new ListNode(4);
		ListNode node11 = new ListNode(1);
		ListNode node81 = new ListNode(8);
		ListNode node42 = new ListNode(4);
		ListNode node51 = new ListNode(5);
		
		ListNode node52 = new ListNode(5);
		ListNode node01 = new ListNode(0);
		ListNode node12 = new ListNode(1);
		
		
//		ListNode headA = node41;
//		headA.next = node11;
//		headA.next.next = node81;
//		headA.next.next.next = node42;
//		headA.next.next.next.next = node51;
//		ListNode headB = node52;
//		headB.next = node01;
//		headB.next.next = node12;
//		headB.next.next.next = node81;
//		headB.next.next.next.next = node42;
//		headB.next.next.next.next.next = node51;
		
		ListNode headA = node41;
		headA.next = node11;
		headA.next.next = node81;
		ListNode headB = node52;
		headB.next = node01;
		headB.next.next = node12;
		
//		ListNode headA = node41;
//		ListNode headB = node41;
		
//		ListNode headA = node41;
//		ListNode headB = node12;
		
//		ListNode headA = null;
//		ListNode headB = node12;
		
//		ListNode headA = node12;
//		ListNode headB = null;
		
		
		ListNode intersectionNode = new IntersectionOfTwoLinkedLists().getIntersectionNodeSol2(headA, headB);
		System.out.println(intersectionNode == null ? "null" : intersectionNode.val);
	}
	
	public ListNode getIntersectionNodeSol2(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null) {
			return null;
		}
		
		ListNode nodeA = headA;
		ListNode nodeB = headB;
		
		while(nodeA != null && nodeB != null) {
			if(nodeA == nodeB) {
				return nodeA;
			}
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
		
		if(nodeA == null || nodeB == null) {
			if(nodeA == null) {
				nodeA = headB;
			}
			else {
				nodeB = headA;
			}
			
			while(nodeA != null && nodeB != null) {
				if(nodeA == nodeB) {
					return nodeA;
				}
				nodeA = nodeA.next;
				nodeB = nodeB.next;
			}
		}
		
		if(nodeA == null || nodeB == null) {
			if(nodeA == null) {
				nodeA = headB;
			}
			else {
				nodeB = headA;
			}
			
			while(nodeA != null && nodeB != null) {
				if(nodeA == nodeB) {
					return nodeA;
				}
				nodeA = nodeA.next;
				nodeB = nodeB.next;
			}
		}
		
		return null;
	}

	public ListNode getIntersectionNodeSol1(ListNode headA, ListNode headB) {

		Set<ListNode> listAnodes = new HashSet<ListNode>();
		ListNode nodeA = headA;
		ListNode nodeB = headB;
		
		while(nodeA != null) {
			listAnodes.add(nodeA);
			nodeA = nodeA.next;
		}
		
		while(nodeB != null) {
			if(listAnodes.contains(nodeB)) {
				return nodeB;
			}
			nodeB = nodeB.next;
		}
		
		return null;
	}
}
