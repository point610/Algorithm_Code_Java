package CodeTop.TX.TX100;

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
    private boolean same;

    private void DFS(TreeNode one, TreeNode two) {
        if (!same) {
            return;
        }
        if (one == null && two == null) {
            return;
        }
        if (one == null || two == null || one.val != two.val) {
            same = false;
            return;
        }

        DFS(one.left, two.left);
        DFS(one.right, two.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        same = true;

        DFS(p, q);

        return same;
    }
}

public class TX100 {
}
