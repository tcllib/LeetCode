package algorithm.tree;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 *
 * algorithms
 * Medium (50.01%)
 * Likes:    2006
 * Dislikes: 55
 * Total Accepted:    474.6K
 * Total Submissions: 927.4K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 *
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 *
 *
 *
 * return its level order traversal as:
 *
 * [
 * ⁠ [3],
 * ⁠ [9,20],
 * ⁠ [15,7]
 * ]
 *
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> currentLevel = new ArrayList<>();
        List<TreeNode> nextLevel = new ArrayList<>();
        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            nextLevel.clear();
            List<Integer> levelVals = new ArrayList<>();
            for (TreeNode treeNode : currentLevel) {
                levelVals.add(treeNode.val);
                if (treeNode.left != null) {
                    nextLevel.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    nextLevel.add(treeNode.right);
                }
            }

            result.add(levelVals);
            currentLevel.clear();
            currentLevel.addAll(nextLevel);
        }

        return result;
    }

    public List<List<Integer>> levelOrderWithQueue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}
