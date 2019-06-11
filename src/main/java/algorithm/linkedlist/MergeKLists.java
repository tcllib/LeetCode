package algorithm.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * [23] Merge k Sorted Lists
 */
public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt(node -> node.val));
        for(ListNode list: lists) {
            if(list != null) queue.add(list);
        }

        while(!queue.isEmpty()) {
            current.next = queue.poll();
            current = current.next;

            if(current.next != null) {
                queue.add(current.next);
            }
        }


        return dummyHead.next;
    }
}
