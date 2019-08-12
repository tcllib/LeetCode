package algorithm.tree;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void build() {
        TreeNode build = TreeNode.build(new Integer[]{1,2,3,null,3,6,7,4,5});
        System.out.println("");
    }

    @Test
    void level_order_traversal() {
        TreeNode tree = TreeNode.build(new Integer[]{1, null, 2, null, 3});
        System.out.println(TreeNode.levelOrderTraversal(tree));
    }
}