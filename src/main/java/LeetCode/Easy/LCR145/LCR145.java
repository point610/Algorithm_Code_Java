package LeetCode.Easy.LCR145;

/**
 * @ClassName LCR145
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 11:34
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
    boolean same = true;

    void DFS(TreeNode left, TreeNode right) {
        if (!same) {
            return;
        }
        if (left == null && right == null) {
            return;
        }
        if (left != null && right == null) {
            same = false;
            return;
        }
        if (left == null && right != null) {
            same = false;
            return;
        }
        if (left.val != right.val) {
            same = false;
            return;
        }
        DFS(left.left, right.right);
        DFS(left.right, right.left);
    }

    public boolean checkSymmetricTree(TreeNode root) {
        if (root==null){
            return true;
        }
        DFS(root.left, root.right);
        return same;
    }
}

public class LCR145 {
}
