package LeetCode.Easy.LeetCode617;

/**
 * @ClassName LeetCode617
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 0:36
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
    void DFS(TreeNode one, TreeNode two) {
        if (two == null) {
            return;
        }
        one.val += two.val;
        if (two.left == null && two.right == null) {
            return;
        }
        if (one.left != null && two.left != null) {
            DFS(one.left, two.left);
        }
        if (one.right != null && two.right != null) {
            DFS(one.right, two.right);
        }

        if (one.left == null && two.left != null) {
            one.left = two.left;
        }
        if (one.right == null && two.right != null) {
            one.right = two.right;
        }
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        DFS(root1, root2);
        return root1;
    }
}

public class LeetCode617 {
}
