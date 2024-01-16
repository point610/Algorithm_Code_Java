package LeetCode.Easy.LCR144;

/**
 * @ClassName LCR144
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 21:09
 * @Version 1.0
 */

class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = right;
        node.right = left;
        DFS(node.left);
        DFS(node.right);
    }

    public TreeNode mirrorTree(TreeNode root) {
        DFS(root);
        return root;
    }
}

public class LCR144 {
}
