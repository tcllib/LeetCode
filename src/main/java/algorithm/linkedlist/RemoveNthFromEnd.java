package algorithm.linkedlist;

/**
 * [19] Remove Nth Node From End of List
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode first = dummyHead;
        ListNode second = dummyHead;

        for (int i = 1; i <= n; i++) {
            first = first.next;
        }

        while (first != null && first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummyHead.next;
    }
}
