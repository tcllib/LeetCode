package algorithm.tree;

import java.util.Stack;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        pushAllLeftToStack(root, stack);
        TreeNode left = null;

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if(left != null && left.val >= current.val) {
                return false;
            }

            left = current;
            pushAllLeftToStack(current.right, stack);
        }

        return true;
    }

    private void pushAllLeftToStack(TreeNode node, Stack stack) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
