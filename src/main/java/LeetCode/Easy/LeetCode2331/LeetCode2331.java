package LeetCode.Easy.LeetCode2331;

/**
 * @ClassName LeetCode2331
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 13:21
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

    boolean DFS(TreeNode node) {
        if (node.left == null && node.right == null) {
            return node.val == 1;
        }
        boolean resboolean = false;
        if (node.val == 2) {
            // or
            resboolean = DFS(node.left) || DFS(node.right);

        } else {
            // and
            resboolean = DFS(node.left) && DFS(node.right);

        }
        return resboolean;

    }

    public boolean evaluateTree(TreeNode root) {
        return DFS(root);
    }
}

public class LeetCode2331 {
}
