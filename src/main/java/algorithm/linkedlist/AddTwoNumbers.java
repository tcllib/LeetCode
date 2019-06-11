package algorithm.linkedlist;

/**
 *
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode emptyHead = new ListNode(0);
        ListNode current = emptyHead;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int value = getNodeValue(l1) + getNodeValue(l2) + carry;
            int digit = value % 10;
            carry = value / 10;

            ListNode next = new ListNode(digit);
            current.next = next;
            current = next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry != 0) {
            current.next = new ListNode(carry);
        }

        return emptyHead.next;
    }

    public Integer getNodeValue(ListNode node) {
        return node == null ? 0:node.val;
    }
}
