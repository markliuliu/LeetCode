package Q237X;

import util.ListNode;

/**
 * this question is bad!
 */
public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        ListNode nowNode = node;
        nowNode = nowNode.next;
        if(nowNode.next!=null) nowNode.next = nowNode.next.next;

    }
}
