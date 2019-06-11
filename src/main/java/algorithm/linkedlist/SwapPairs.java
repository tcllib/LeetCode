package algorithm.linkedlist;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode current = head;
        while(current != null && current.next != null) {
            ListNode next = current.next.next;
            swap(current, current.next);
            current = next;
        }

        return newHead;
    }

    private void swap(ListNode first, ListNode second) {
        if(second.next != null) {
            if(second.next.next != null) {
                first.next = second.next.next;
            } else {
                first.next = second.next;
            }
        } else {
            first.next = null;
        }
        second.next = first;
    }
}
