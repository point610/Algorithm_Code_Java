package CodeTop.HW.HW1080;

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
    int limit;

    private boolean DFS(TreeNode node, int sum) {
        if (node == null) {
            return false;
        }
        // 叶子节点
        if (node.left == null && node.right == null) {
            return node.val + sum >= limit;
        }

        boolean left = DFS(node.left, sum + node.val);
        boolean right = DFS(node.right, sum + node.val);

        if (!left) {
            node.left = null;
        }
        if (!right) {
            node.right = null;
        }
        return left || right;

    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        this.limit = limit;
        return DFS(root, 0) ? root : null;
    }
}

public class HW1080 {


}
