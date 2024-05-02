package LeetCode.Middle.LeetCode2385;


import java.math.BigInteger;
import java.util.*;

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

    private Map<TreeNode, TreeNode> father;
    private TreeNode startnode;

    private void initial(TreeNode node, int start, TreeNode fa) {
        if (node == null) {
            return;
        }
        if (node.val == start) {
            startnode = node;
        }
        father.put(node, fa);

        initial(node.left, start, node);
        initial(node.right, start, node);

    }

    private int dfs(TreeNode node, TreeNode from) {
        if (node == null) {
            return -1;
        }
        int res = -1;
        if (node.left != from) {
            res = Math.max(res, dfs(node.left, node));
        }
        if (node.right != from) {
            res = Math.max(res, dfs(node.right, node));
        }
        if (father.get(node) != from) {
            res = Math.max(res, dfs(father.get(node), node));
        }
        return res + 1;
    }

    public int amountOfTime(TreeNode root, int start) {
        if (root == null) {
            return 0;
        }
        father = new HashMap<>();
        startnode = null;

        initial(root, start, null);

        return dfs(startnode, startnode);
    }
}

public class LeetCode2385 {
}






















