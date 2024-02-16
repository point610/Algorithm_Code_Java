package CodeTop.TX.TX101;

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

    private void DFS(TreeNode ll, TreeNode rr) {
        if (ll == null && rr == null) {
            return;
        }
        if (ll == null || rr == null) {
            same = false;
            return;
        }
        if (!same) {
            return;
        }
        if (ll.val != rr.val) {
            same = false;
            return;
        }
        DFS(ll.left, rr.right);
        DFS(ll.right, rr.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        same = true;

        DFS(root.left,root.right);

        return same;
    }
}

public class TX101 {
}
