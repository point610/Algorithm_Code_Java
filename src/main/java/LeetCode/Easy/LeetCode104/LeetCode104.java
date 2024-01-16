package LeetCode.Easy.LeetCode104;

/**
 * @ClassName LeetCode104
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 0:37
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
    int max = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        root.val = 1;
        max = 1;
        DFS(root);

        return max;
    }

    private void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            node.left.val = node.val + 1;
            max = Math.max(max, node.val + 1);
            DFS(node.left);
        }
        if (node.right != null) {
            node.right.val = node.val + 1;
            max = Math.max(max, node.val + 1);
            DFS(node.right);
        }

    }
}

public class LeetCode104 {
}
