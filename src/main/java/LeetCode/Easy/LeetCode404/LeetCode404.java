package LeetCode.Easy.LeetCode404;

/**
 * @ClassName LeetCode404
 * @Description TODO
 * @Author point
 * @Date 2023/7/15 12:32
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

    void dfs(TreeNode node) {

        if (node == null) {
            return;
        }
        if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
                // 为叶子结点
                sum += node.left.val;
            }
        }
        dfs(node.left);
        dfs(node.right);

    }
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }
}

public class LeetCode404 {
}
