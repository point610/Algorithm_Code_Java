package LeetCode.Easy.LeetCode563;

/**
 * @ClassName LeetCode563
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 16:18
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

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        DFS(node.right);
        int left = node.left == null ? 0 : node.left.val;
        int right = node.right == null ? 0 : node.right.val;
        node.val += (left + right);
        sum += Math.abs(left - right);
    }

    public int findTilt(TreeNode root) {
        DFS(root);
        return sum;
    }
}

public class LeetCode563 {
}
