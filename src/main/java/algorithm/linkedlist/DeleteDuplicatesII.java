package algorithm.linkedlist;

public class DeleteDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode current = head;
        while(current != null) {
            if(isDuplicate(current)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    private boolean isDuplicate(ListNode node) {
        if(node == null || node.next == null) {
            return false;
        }

        return node.val == node.next.val;
    }
}
