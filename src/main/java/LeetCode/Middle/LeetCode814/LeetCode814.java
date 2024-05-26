package LeetCode.Middle.LeetCode814;


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
    private boolean dfs(TreeNode node) {
        if (node == null) {
            return false;
        }

        boolean left = dfs(node.left);
        boolean right = dfs(node.right);

        if (!left) {
            node.left = null;
        }

        if (!right) {
            node.right = null;
        }

        return node.val == 1 || left || right;
    }

    public TreeNode pruneTree(TreeNode root) {
        boolean res = dfs(root);
        if (!res && root.val == 0) {
            return null;
        }
        return root;
    }
}

public class LeetCode814 {
}
