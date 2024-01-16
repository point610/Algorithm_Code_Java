package LeetCode.Middle.LeetCode124;

/**
 * @ClassName LeetCode124
 * @Description TODO
 * @Author point
 * @Date 2023/11/25 17:14
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
    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        DFS(root);
        return res;
    }

    private int DFS(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = DFS(node.left);
        int right = DFS(node.right);

        res = Math.max(res, node.val + left + right);
        return Math.max(0, node.val + Math.max(left, right));
    }
}

public class LeetCode124 {
}
