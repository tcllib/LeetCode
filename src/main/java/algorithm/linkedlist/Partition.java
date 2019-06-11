package algorithm.linkedlist;

public class Partition {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;

        ListNode leftDummyHead = new ListNode(0);
        ListNode rightDummyHead = new ListNode(0);
        ListNode leftCurrent = leftDummyHead;
        ListNode rightCurrent = rightDummyHead;

        while(head != null) {
            if(head.val < x) {
                leftCurrent.next = head;
                leftCurrent = leftCurrent.next;
                rightCurrent.next = null;
            } else {
                rightCurrent.next = head;
                rightCurrent = rightCurrent.next;
                leftCurrent.next = null;
            }

            head = head.next;
        }

        leftCurrent.next = rightDummyHead.next;

        return leftDummyHead.next;
    }
}
