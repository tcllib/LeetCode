package algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
 *
 * https://leetcode.com/problems/unique-binary-search-trees-ii/description/
 *
 * algorithms
 * Medium (36.38%)
 * Likes:    1348
 * Dislikes: 117
 * Total Accepted:    145.9K
 * Total Submissions: 401.1K
 * Testcase Example:  '3'
 *
 * Given an integer n, generate all structurally unique BST's (binary search
 * trees) that store values 1 ... n.
 *
 * Example:
 *
 *
 * Input: 3
 * Output:
 * [
 * [1,null,3,2],
 * [3,2,null,1],
 * [3,1,null,null,2],
 * [2,1,3],
 * [1,null,2,null,3]
 * ]
 * Explanation:
 * The above output corresponds to the 5 unique BST's shown below:
 *
 * ⁠  1         3     3      2      1
 * ⁠   \       /     /      / \      \
 * ⁠    3     2     1      1   3      2
 * ⁠   /     /       \                 \
 * ⁠  2     1         2                 3
 *
 *
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class UniqueBSTII {
    public List<TreeNode> generateTreesRecur(int n) {
        if(n == 0) {
            return List.of();
        }

        return generateTreesByRange(1, n);
    }

    private List<TreeNode> generateTreesByRange(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if(start == end) {
            trees.add(new TreeNode(start));
            return trees;
        }

        if (start > end) {
            trees.add(null);
            return trees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateTreesByRange(start, i - 1);
            List<TreeNode> right = generateTreesByRange(i + 1, end);

            trees.addAll(getAllTreesBySubTress(i, left, right));
        }

        return trees;
    }

    private List<TreeNode> getAllTreesBySubTress(int i, List<TreeNode> left, List<TreeNode> right) {
        List<TreeNode> all = new ArrayList<>();

        for (TreeNode leftTree: left) {
            for(TreeNode rightTree: right) {
                TreeNode tree = new TreeNode(i);
                tree.left = leftTree;
                tree.right = rightTree;
                all.add(tree);
            }
        }

        return all;
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return List.of();
        }

        List<TreeNode> pre = new ArrayList<>();
        pre.add(new TreeNode(1));
        for (int i = 2; i <= n; i++) {
            List<TreeNode> current = new ArrayList<>();
            for (TreeNode treeNode: pre) {
                //add to right hand side
                current.addAll(getNewTreesByReplacingRightChild(i, treeNode));

                //add i as root
                TreeNode newTreeNode = getNewTreeByReplacingRoot(i, treeNode);
                current.add(newTreeNode);
            }

            pre = current;
        }

        return pre;
    }

    private List<TreeNode> getNewTreesByReplacingRightChild(int i, TreeNode treeNode) {
        ArrayList<TreeNode> newTreeList = new ArrayList<>();
        //add as the right-most child
        TreeNode copy = copyTree(treeNode);
        TreeNode rightMostNode = getRightMostNode(copy);
        rightMostNode.right = new TreeNode(i);
        newTreeList.add(copy);

        //add as right child at different level
        TreeNode root = copyTree(treeNode);
        TreeNode currentRight = treeNode.right;
        while(currentRight != null) {
            TreeNode newNode = new TreeNode(i);
            root.right = newNode;
            newNode.left = currentRight;
            newTreeList.add(root);

            root = copyTree(currentRight);
            currentRight = root.right;
        }

        return newTreeList;
    }

    public TreeNode getRightMostNode(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }

        TreeNode current = treeNode;
        TreeNode right = current.right;
        while (right != null) {
            current = current.right;
            right = current.right;
        }

        return current;
    }

    private TreeNode getNewTreeByReplacingRoot(int i, TreeNode oldTreeNode) {
        TreeNode newTreeNode = new TreeNode(i);
        newTreeNode.left = oldTreeNode;
        return newTreeNode;
    }

    private TreeNode copyTree(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }

        TreeNode newTreeNode = new TreeNode(treeNode.val);
        newTreeNode.left = copyTree(treeNode.left);
        newTreeNode.right = copyTree(treeNode.right);
        return newTreeNode;
    }
}
