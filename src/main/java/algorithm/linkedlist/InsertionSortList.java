package algorithm.linkedlist;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode current = head;
        ListNode prev;
        while (current != null) {
            ListNode next = current.next;

            prev = dummyHead;
            while (prev.next != null && current.val > prev.next.val) {
                prev = prev.next;
            }

            current.next = prev.next;
            prev.next = current;

            current = next;
        }

        return dummyHead.next;
    }


}
