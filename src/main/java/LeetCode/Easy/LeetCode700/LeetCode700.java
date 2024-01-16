package LeetCode.Easy.LeetCode700;

/**
 * @ClassName LeetCode700
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 0:53
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
    TreeNode res =null;

    public TreeNode searchBST(TreeNode root, int val) {
        DFS(root, val);
        return res;
    }

    private void DFS(TreeNode node, int val) {
        if (node == null) {
            return;
        }
        if (node.val == val) {
            res = node;
            return;
        }
        if (node.val > val) {
            DFS(node.left, val);
        }
        if (node.val < val) {
            DFS(node.right, val);
        }
    }
}

public class LeetCode700 {
}
