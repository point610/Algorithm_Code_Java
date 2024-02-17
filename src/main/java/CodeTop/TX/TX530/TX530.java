package CodeTop.TX.TX530;

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
    private int res;
    private int pre;

    private void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);

        if (pre == -1) {
            pre = node.val;
        } else {
            res = Math.min(res, Math.abs(node.val - pre));
            pre = node.val;
        }

        DFS(node.right);
    }


    public int getMinimumDifference(TreeNode root) {
        res = Integer.MAX_VALUE;

        pre = -1;
        DFS(root);

        return res;
    }
}

public class TX530 {
}
