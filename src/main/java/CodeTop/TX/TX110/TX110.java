package CodeTop.TX.TX110;

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
    private boolean res;

    private int DFS(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = DFS(node.left);
        int right = DFS(node.right);
        if (Math.abs(left - right) > 1) {
            res = false;
        }
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        res = true;

        DFS(root);

        return res;
    }
}

public class TX110 {
}
