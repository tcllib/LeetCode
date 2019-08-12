package algorithm.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalTest {

    @Test
    void inorderTraversal() {
        InorderTraversal inorderTraversal = new InorderTraversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(inorderTraversal.inorderTraversal(root));
    }
}