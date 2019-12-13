package easy;

import java.util.HashSet;
import java.util.Set;

import definition.ListNode;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		
		ListNode node3 = new ListNode(3);
		ListNode node6 = new ListNode(6);
		ListNode node9 = new ListNode(9);
		ListNode node10 = new ListNode(10);
		ListNode node15 = new ListNode(15);
		ListNode node30 = new ListNode(30);
		
		ListNode headA = node3;
		headA.next = node6;
		headA.next.next = node9;
		headA.next.next.next = node15;
		headA.next.next.next.next = node30;
		ListNode headB = node10;
		headB.next = node15;
		headB.next.next = node30;
		
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
		
//		ListNode headA = node41;
//		headA.next = node11;
//		headA.next.next = node81;
//		ListNode headB = node52;
//		headB.next = node01;
//		headB.next.next = node12;
		
//		ListNode headA = node41;
//		ListNode headB = node41;
		
//		ListNode headA = node41;
//		ListNode headB = node12;
		
//		ListNode headA = null;
//		ListNode headB = node12;
		
//		ListNode headA = node12;
//		ListNode headB = null;
		
		
		ListNode intersectionNode = new IntersectionOfTwoLinkedLists().getIntersectionNode_Sol3(headA, headB);
		System.out.println(intersectionNode == null ? "null" : intersectionNode.val);
	}
	
	public ListNode getIntersectionNode_Sol3(ListNode headA, ListNode headB) {
		
		boolean listAHeadChanged = false, listBHeadChanged = false;
		ListNode nodeA = headA, nodeB = headB;
		
		while(nodeA != null && nodeB != null) {
			
			if(nodeA == nodeB) {
				return nodeA;
			}
			else {
				nodeA = nodeA.next;
				nodeB = nodeB.next;
			}
			
			if(!listAHeadChanged && nodeA == null) {
				nodeA = headB;
				listAHeadChanged = true;
			}
			
			if(!listBHeadChanged && nodeB == null) {
				nodeB = headA;
				listBHeadChanged = true;
			}
		}
		
		return null;
	}
	
	public ListNode getIntersectionNode_Sol2(ListNode headA, ListNode headB) {
		
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

	public ListNode getIntersectionNode_Sol1(ListNode headA, ListNode headB) {

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
