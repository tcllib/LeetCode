package algorithm.dynamicprogramming;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack();

        int max = 0;
        int leftMost = -1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if(stack.isEmpty()) {
                    leftMost = i;
                } else {
                    stack.pop();
                    int start = 0;
                    if(stack.isEmpty()) {
                        start = leftMost;
                    } else {
                        start = stack.peek();
                    }
                    max = Math.max(i - start, max);
                }


            }
        }

        return max;
    }
}
