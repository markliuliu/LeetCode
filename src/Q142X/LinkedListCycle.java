package Q142X;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null)return null;
        ListNode temp;
        Set<ListNode> set = new HashSet<>();
        for(temp = head.next; temp!=null; temp =temp.next) {
            if(set.contains(temp)){ break; }
            set.add(temp);
        }
        return temp;
    }
}
