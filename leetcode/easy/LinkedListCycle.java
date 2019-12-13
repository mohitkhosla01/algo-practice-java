package easy;

import java.util.HashSet;
import java.util.Set;

import definition.ListNode;

public class LinkedListCycle {
	
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();

        while(head != null) {
            if(set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        
        return false;
    }
}
