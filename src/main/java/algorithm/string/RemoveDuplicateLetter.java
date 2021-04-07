package algorithm.string;

import java.util.HashMap;
import java.util.Stack;

public class RemoveDuplicateLetter {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> occurrence = new HashMap<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (occurrence.containsKey(c)) {
                Integer count = occurrence.get(c);
                occurrence.put(c, count + 1);
            } else {
                occurrence.put(c, 1);
            }
        }

        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            while (occurrence.get(stack.peek()) - 1 > 0 && c < stack.peek()) {
                occurrence.put(stack.peek(), occurrence.get(stack.peek()) - 1);
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
            }

            if (stack.isEmpty() || !stack.contains(c)) {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
