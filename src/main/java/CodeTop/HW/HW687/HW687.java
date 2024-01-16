package CodeTop.HW.HW687;

/**
 * @ClassName HW687
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 16:38
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
    private int max;

    private int DFS(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = 0;
        int right = 0;

        left = DFS(node.left);
        right = DFS(node.right);

        int ll = 1;
        int rr = 1;
        if (left != 0 && node.val == node.left.val) {
            ll += left;
        }
        if (right != 0 && node.val == node.right.val) {
            rr += right;
        }
        max = Math.max(max, Math.max(1, ll + rr - 1));
        return Math.max(ll, rr);
    }

    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        if (root == null) {
            return 0;
        }
        DFS(root);
        return max-1;
    }
}

public class HW687 {
}
