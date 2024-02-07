package CodeTop.HW.HW124;

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
    private int max;

    private int DFS(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, DFS(node.left));
        int right = Math.max(0, DFS(node.right));

        int current = node.val;

        int ccii = left + right + current;
        int ccll = left + current;
        int ccrr = right + current;

        max = Math.max(ccii, max);

        return Math.max(ccll, ccrr);

    }

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        max = Integer.MIN_VALUE;

        DFS(root);

        return max;
    }
}

public class HW124 {
}
