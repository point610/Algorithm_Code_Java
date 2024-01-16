package CodeTop.HW.HW111;

/**
 * @ClassName HW111
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:26
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
    private int level = Integer.MAX_VALUE;

    void DFS(int temp, TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            level = Math.min(level, temp);
        }
        DFS(temp + 1, node.left);
        DFS(temp + 1, node.right);
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        DFS(1, root);
        return level;
    }
}

public class HW111 {


}
