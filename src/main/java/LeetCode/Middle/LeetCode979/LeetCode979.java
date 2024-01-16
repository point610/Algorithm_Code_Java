package LeetCode.Middle.LeetCode979;

/**
 * @ClassName LeetCode979
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 23:49
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
    // 需要返回的总的移动步数
    int move = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return move;
    }

    public int dfs(TreeNode node) {
        int moveleft = 0;
        int moveright = 0;
        if (node == null) {
            return 0;
        }
        if (node.left != null) {
            moveleft = dfs(node.left);
        }
        if (node.right != null) {
            moveright = dfs(node.right);
        }
        move += Math.abs(moveleft) + Math.abs(moveright);
        // 左右需要移动的，加上当前结点的val，减去1
        // 当前node需要自己保存一个金币
        return moveleft + moveright + node.val - 1;
    }
}

public class LeetCode979 {
}
