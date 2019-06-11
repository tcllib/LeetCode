package algorithm.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void test_build() {
        System.out.println(ListNode.build(new int[]{1, 2, 3, 4}).toString());
    }

    @Test
    void equals1() {
        assertEquals(ListNode.build(new int[]{1, 2, 3, 4}), ListNode.build(new int[]{1, 2, 3, 4}));
        assertNotEquals(ListNode.build(new int[]{1, 2, 3, 4}), ListNode.build(new int[]{1, 2, 3}));
    }

    @Test
    void toString1() {
        ListNode head = new ListNode(0);
        ListNode next = new ListNode(1);

        head.next = next;

        System.out.println(head.toString());
    }
}