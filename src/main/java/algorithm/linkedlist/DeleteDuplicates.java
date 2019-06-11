package algorithm.linkedlist;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode current = head;

        while(current != null) {
            if(isDuplicate(current)) {
                ListNode lastDuplicateNode = lastDuplicateNode(current);
                prev.next = lastDuplicateNode.next;
                current = lastDuplicateNode.next;
            } else {
                current = current.next;
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

    private boolean isDuplicate(ListNode node) {
        if(node == null || node.next == null) {
            return false;
        }

        return node.val == node.next.val;
    }

    private ListNode lastDuplicateNode(ListNode node) {
        ListNode current = node;
        while(current != null && current.next != null && current.val == current.next.val) {
            current = current.next;
        }

        return current;
    }
}
