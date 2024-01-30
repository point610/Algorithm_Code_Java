package CodeTop.HW.HW1302;

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
    private int sum;
    private int maxlevel;

    private void DFS(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (level > maxlevel) {
                maxlevel = level;
                sum = node.val;
                return;
            }

            if (level == maxlevel) {
                sum += node.val;
                return;
            }
        }

        DFS(node.left, level + 1);
        DFS(node.right, level + 1);

    }

    public int deepestLeavesSum(TreeNode root) {
        sum = 0;
        maxlevel = 0;

        DFS(root, 0);

        return sum;

    }
}

public class HW1302 {
}
