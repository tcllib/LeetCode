package algorithm.linkedlist;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddPointer = oddHead;
        ListNode evenPointer = evenHead;

        while (evenPointer != null && evenPointer.next != null) {
            oddPointer.next = evenPointer.next;
            oddPointer = oddPointer.next;
            evenPointer.next = oddPointer.next;
            evenPointer = evenPointer.next;
        }

        oddPointer.next = evenHead;
        return oddHead;
    }
}
