package algorithm.tree;

/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 *
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 *
 * algorithms
 * Medium (43.01%)
 * Likes:    2306
 * Dislikes: 62
 * Total Accepted:    279.5K
 * Total Submissions: 627.8K
 * Testcase Example:  '[3,9,20,15,7]\n[9,3,15,20,7]'
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 *
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 *            [20,9,3,15,7]
 * Return the following binary tree:
 *
 *
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 *
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * pre order cannot tell me 20, 5, 7 is the right children of root or children of 9
 */
public class ConstructPreInOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        int root = preorder[0];
        Map<Integer, Integer> integerIntegerMap = toMap(inorder);
        int rootIndexInInOrder = integerIntegerMap.get(root);

        int[] leftSubTreeInOrder = Arrays.copyOfRange(inorder, 0, rootIndexInInOrder);
        int[] rightSubTreeInOrder = Arrays.copyOfRange(inorder, rootIndexInInOrder + 1, inorder.length);
        int[] leftSubTreePreOrder = Arrays.copyOfRange(preorder, 1, rootIndexInInOrder + 1);
        int[] rightSubTreePreOrder = Arrays.copyOfRange(preorder, rootIndexInInOrder + 1, preorder.length);

        TreeNode leftTree = buildTree(leftSubTreePreOrder, leftSubTreeInOrder);
        TreeNode rightTree = buildTree(rightSubTreePreOrder, rightSubTreeInOrder);
        TreeNode result = new TreeNode(root);
        result.left = leftTree;
        result.right = rightTree;

        return result;
    }

    private Map<Integer, Integer> toMap(int[] order) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length; i++) {
            map.put(order[i], i);
        }

        return map;
    }
}
