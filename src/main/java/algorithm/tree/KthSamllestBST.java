package algorithm.tree;

import java.util.Stack;

public class KthSamllestBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        pushAllLeftToStack(root, stack);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if(--k == 0) {
                return current.val;
            }
            pushAllLeftToStack(current.right, stack);
        }

        return 0;
    }

    private void pushAllLeftToStack(TreeNode node, Stack<TreeNode> stack) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
