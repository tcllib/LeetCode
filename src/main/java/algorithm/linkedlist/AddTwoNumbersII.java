package algorithm.linkedlist;

import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = toStack(l1);
        Stack<Integer> stack2 = toStack(l2);

        int carry = 0;
        ListNode dummyHead = new ListNode(0);
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            int value1 = getValue(stack1);
            int value2 = getValue(stack2);

            int sum = value1 + value2 + carry;
            int current = sum % 10;
            carry = sum / 10;

            ListNode currentNode = new ListNode(current);
            currentNode.next = dummyHead.next;
            dummyHead.next = currentNode;
        }

        if(carry != 0) {
            ListNode node = new ListNode(carry);
            node.next = dummyHead.next;
            dummyHead.next = node;
        }

        return dummyHead.next;
    }

    private int getValue(Stack<Integer> stack) {
        return stack.isEmpty() ? 0 : stack.pop();
    }

    private Stack toStack(ListNode l1) {
        Stack stack = new Stack();
        while(l1 != null) {
            stack.push(l1.val);
            l1 = l1.next;
        }

        return stack;
    }
}
