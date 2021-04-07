package algorithm.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTraversalTest {

    @Test
    void name() {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        List<Integer> integers = preOrderTraversal.preorderTraversal(TreeNode.build(new Integer[]{4, 9, 0, 5, 1}));

        System.out.println(integers);
    }
}
