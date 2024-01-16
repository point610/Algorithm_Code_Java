package LeetCode.Easy.LeetCode222;

/**
 * @ClassName LeetCode222
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 22:47
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
    private int count;

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        count++;
        DFS(node.left);
        DFS(node.right);

    }

    public int countNodes(TreeNode root) {
        count = 0;
        DFS(root);
        return count;
    }
}

public class LeetCode222 {
}
