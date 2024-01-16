package CodeTop.HW.HW572;

/**
 * @ClassName HW572
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 16:14
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

    private boolean sign = false;

    private boolean temp = true;

    void same(TreeNode one, TreeNode two) {
        if (one == null && two == null) {
            return;
        }
        if (one == null || two == null) {
            temp = false;
            return;
        }
        if (one.val != two.val) {
            temp = false;
            return;
        }
        same(one.left, two.left);
        same(one.right, two.right);

    }

    void DFS(TreeNode root, TreeNode sub) {
        if (root == null) {
            return;
        }
        temp = true;
        same(root, sub);
        if (temp) {
            sign = true;
        }
        DFS(root.left, sub);
        DFS(root.right, sub);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        DFS(root, subRoot);
        return sign;
    }
}

public class HW572 {
}
