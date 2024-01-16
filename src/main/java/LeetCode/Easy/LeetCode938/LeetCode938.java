package LeetCode.Easy.LeetCode938;

/**
 * @ClassName LeetCode938
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 22:06
 * @Version 1.0
 */


class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int sum = 0;

    void DFS(TreeNode node, int low, int high) {
        if (node == null) {
            return;
        }

        if (node.val < low) {
            DFS(node.right, low, high);
            return;
        }

        if (high < node.val) {
            DFS(node.left, low, high);
            return;

        }
        sum += node.val;
        DFS(node.right, low, high);
        DFS(node.left, low, high);
    }

    public int rangeSumBST(TreeNode root, int low, int high) {

        DFS(root, low, high);
        return sum;

    }
}

public class LeetCode938 {
}
