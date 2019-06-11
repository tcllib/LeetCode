package algorithm.linkedlist;

/**
 * [143] Reorder List
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode reverseHead = mid.next;
        mid.next = null;

        ListNode reversedHalf = reverseList(slow.next);
        System.out.println(reversedHalf.val);

        ListNode left = head;
        ListNode right = reversedHalf;

        while(left != null) {
            ListNode leftNext = left.next;
            ListNode rightNext = right.next;
            left.next = right;
            right.next = leftNext;

            left = leftNext;
            right = rightNext;
        }
    }

    private ListNode reverseList(ListNode head) {
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
