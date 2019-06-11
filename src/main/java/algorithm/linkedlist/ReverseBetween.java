package algorithm.linkedlist;

/**
 * [92] Reverse Linked List II
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;

        int index = 1;
        ListNode current = head;
        ListNode prev = null;

        while(current != null && index <= m -1) {
            prev = current;
            current = current.next;
            index++;
        }

        ListNode headBeforeReverse = prev;
        ListNode reverseHead = current;

        while(current != null && index <= n) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

            index ++;
        }

        reverseHead.next = current;
        if(headBeforeReverse == null) {
            return prev;
        }

        headBeforeReverse.next = prev;


        return head;
    }
}
