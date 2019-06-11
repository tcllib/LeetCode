package algorithm.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode build(int[] list) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for(int node: list)  {
            current.next = new ListNode(node);
            current = current.next;
        }

        return dummyHead.next;
    }

    @Override
    public boolean equals(Object o) {
        ListNode other = (ListNode) o;
        ListNode current = this;

        while (other != null && current != null) {
            if(other.val != current.val) return false;

            other = other.next;
            current = current.next;
        }

        if(other != null || current != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        List<Integer> list = new ArrayList<>();
        ListNode current = this;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }

        return list.toString();
    }
}
