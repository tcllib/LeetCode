package algorithm.linkedlist;

/**
 * [61] Rotate List
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return null;
        }

        ListNode end = head;
        int length = 0;
        while (end.next != null) {
            length++;
            end = end.next;
        }
        length++;

        if(k == 0 || k%length == 0) {
            return head;
        }

        ListNode currrent = new ListNode(0);
        currrent.next = head;
        for(int i = 1; i <= (length - k%length); i++) {
            currrent = currrent.next;
        }

        end.next = head;
        ListNode newHead = currrent.next;
        currrent.next = null;

        return newHead;
    }
}
