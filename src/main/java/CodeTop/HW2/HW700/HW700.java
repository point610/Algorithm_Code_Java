package CodeTop.HW2.HW700;

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
    private TreeNode findTree;
    private boolean find;

    private void DFS(TreeNode node, int val) {
        if (node == null || find) {
            return;
        }
        if (val == node.val) {
            find = true;
            findTree = node;
            return;
        }
        DFS(node.left, val);
        DFS(node.right, val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        findTree = null;
        find = false;

        DFS(root, val);

        return findTree;
    }
}

public class HW700 {
}
