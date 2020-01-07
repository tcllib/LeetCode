package algorithm.tree;

import java.util.*;
import java.util.stream.Collectors;

public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(Integer x) { val = x; }

    TreeNode(Integer x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }

    public static TreeNode build(Integer[] list) {
        if(list == null) {
            return null;
        }

        if(list.length == 0) {
            return new TreeNode();
        }

        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(list[0]);
        q.add(root);
        TreeNode cur = null;
        for(int i = 1; i < list.length; i++){
            TreeNode node = list[i] == null ? null : new TreeNode(list[i]);
            if(count == 0){
                cur = q.poll();
            }
            if(count==0){
                count++;
                cur.left = node;
            }else {
                count = 0;
                cur.right = node;
            }
            if(list[i] != null){
                q.add(node);
            }
        }

        return root;
    }

    public static List<Integer> levelOrderTraversal(TreeNode root) {
        if(root == null) {
            return List.of();
        }

        List<Integer> output = new ArrayList<>();
        List<TreeNode> nextLevel = getNextLevel(List.of(root));
        output.add(root.val);

        while(!nextLevel.isEmpty() && nextLevel.stream().anyMatch(Objects::nonNull)) {
            for (TreeNode treeNode : nextLevel) {
                output.add(Optional.ofNullable(treeNode).map(node -> node.val).orElse(null));
            }

            nextLevel = getNextLevel(nextLevel);
        }

        return output;
    }

    public static List<TreeNode> getNextLevel(List<TreeNode> currentLevel) {
        if (currentLevel == null || currentLevel.isEmpty()) {
            return null;
        }

        List<TreeNode> currentLevelWithoutNull = currentLevel.stream().filter(Objects::nonNull).collect(Collectors.toList());

        List<TreeNode> output = new ArrayList<>();
        for (TreeNode treeNode : currentLevelWithoutNull) {
            output.add(Optional.ofNullable(treeNode.left).orElse(null));
            output.add(Optional.ofNullable(treeNode.right).orElse(null));
        }
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return Objects.equals(val, treeNode.val) &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    //    @Override
//    public String toString() {
//        return
//    }
}
