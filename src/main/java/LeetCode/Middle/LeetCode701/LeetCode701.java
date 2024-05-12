package LeetCode.Middle.LeetCode701;

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
    private void dfs(TreeNode node, int val) {
        TreeNode left = node.left;
        TreeNode right = node.right;

        if (val < node.val) {
            if (left == null) {
                node.left = new TreeNode(val);
                return;
            } else {
                dfs(left, val);
            }
        } else {
            if (right == null) {
                node.right = new TreeNode(val);
                return;
            } else {
                dfs(right, val);
            }
        }

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        dfs(root, val);

        return root;
    }
}

public class LeetCode701 {
}
