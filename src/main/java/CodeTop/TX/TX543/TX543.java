package CodeTop.TX.TX543;

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
        int left = DFS(node.left);
        int right = DFS(node.right);

        max = Math.max(max, left + right + 1);

        return Math.max(left + 1, right + 1);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;

        DFS(root);

        return max;
    }
}

public class TX543 {
}
