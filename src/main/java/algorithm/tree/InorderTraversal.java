package algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * [94] Binary Tree Inorder Traversal
 * The solution can be used to [98] Validate Binary Search Tree and [230] Kth Smallest Element in a BST
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList();
        if (root == null) {
            return output;
        }

        Stack<TreeNode> stack = new Stack();
        pushAllLeftToStack(root, stack);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            output.add(current.val);
            pushAllLeftToStack(current.right, stack);
        }

        return output;
/*
        List<Integer> output = new ArrayList();
        output.addAll(inorderTraversal(root.left));
        output.add(root.val);
        output.addAll(inorderTraversal(root.right));
        return output;
*/
    }

    private void pushAllLeftToStack(TreeNode node, Stack stack) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
