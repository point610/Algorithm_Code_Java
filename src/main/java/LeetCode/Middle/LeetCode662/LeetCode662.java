package LeetCode.Middle.LeetCode662;

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
    // 使用map来记录一层中最左节点在满二叉树中的value
    Map<Integer, Integer> map = new HashMap<>();
    int ans;

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 0);
        return ans;
    }

    void dfs(TreeNode root, int id, int depth) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(depth)) {
            map.put(depth, id);
        }
        // id - map.get(depth) + 1为主要的代码逻辑，在遍历时，实现对同一层中的最大宽度的计算
        ans = Math.max(ans, id - map.get(depth) + 1);
        id = id - map.get(depth) + 1;

        dfs(root.left, id << 1, depth + 1);
        dfs(root.right, id << 1 | 1, depth + 1);
    }
}

public class LeetCode662 {
}
















