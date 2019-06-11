package algorithm.linkedlist;

/**
 * [92] Reverse Linked List II
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
