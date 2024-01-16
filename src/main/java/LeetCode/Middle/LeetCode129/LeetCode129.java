package LeetCode.Middle.LeetCode129;

/**
 * @ClassName LeetCode129
 * @Description TODO
 * @Author point
 * @Date 2023/11/7 22:51
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

    int sum = 0;

    void DFS(TreeNode node, int fathernumber) {
        if (node == null) {
            return;
        }
        int value = fathernumber * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += value;
        }
        DFS(node.left, value);
        DFS(node.right, value);

    }

    public int sumNumbers(TreeNode root) {
        DFS(root, 0);
return sum;
    }
}

public class LeetCode129 {
}
