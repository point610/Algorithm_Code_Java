package LeetCode.Middle.LeetCode623;



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
    private void dfs(TreeNode node, int val, int depth, int curDepth) {
        if (node == null) {
            return;
        }

        if (curDepth == depth - 1) {

            TreeNode left = node.left;
            TreeNode right = node.right;

            node.left = new TreeNode(val);
            node.right = new TreeNode(val);

            node.left.left = left;
            node.right.right = right;

            return;
        }

        dfs(node.left, val, depth, curDepth + 1);
        dfs(node.right, val, depth, curDepth + 1);

    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        dfs(root, val, depth, 1);
        return root;
    }
}

public class LeetCode623 {
}
