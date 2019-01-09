package Q328X;

import util.ListNode;

/**
 * Little bug in the code.
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = null, oddTail = oddHead;
        ListNode evenHead = null, evenTail = evenHead;
        ListNode next =null;
        while(head !=null){
            next=head.next;
            if(head.val%2==1){
                if(oddHead == null){
                    System.out.println(1);
                    oddHead = head;
                    oddTail = head;
                }
                else{
                    System.out.println(2);
                    oddTail.next=head;
                    oddTail = oddTail.next;
                }

            }else{
                if(evenHead == null){
                    System.out.println(3);
                    evenHead = head;
                    evenTail = head;
                }else{
                    System.out.println(4);
                    evenTail.next =head;
                    evenTail = evenTail.next;
                }
            }
            head = next;
        }

        oddTail.next=evenHead;
        return oddHead;
    }
}
