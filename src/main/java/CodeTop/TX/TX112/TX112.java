package CodeTop.TX.TX112;

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

    private void DFS(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        if (sum - node.val == 0 && node.left == null && node.right == null) {
            res = true;
            return;
        }

        DFS(node.left, sum - node.val);
        DFS(node.right, sum - node.val);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        res = false;

        DFS(root, targetSum);

        return res;

    }
}

public class TX112 {
}
