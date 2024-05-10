package LeetCode.Middle.LeetCode655;

import java.util.ArrayList;
import java.util.List;


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
    private int level;
    List<List<String>> list;

    private void getlevel(TreeNode root, int temp) {
        if (root == null) {
            level = Math.max(level, temp);
            return;
        }
        getlevel(root.left, temp + 1);
        getlevel(root.right, temp + 1);
    }

    private void dfs(TreeNode root, int left, int right, int templevel) {
        if (root == null) {
            return;
        }
        int index = (right + left) / 2;
        list.get(templevel).set(index, String.valueOf(root.val));
        dfs(root.left, left, index - 1, templevel + 1);
        dfs(root.right, index + 1, right, templevel + 1);

    }

    public List<List<String>> printTree(TreeNode root) {
        level = 0;
        getlevel(root, 0);
        list = new ArrayList<>();
        int weight = (int) (Math.pow(2, level) - 1);
        for (int i = 0; i < level; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < weight; j++) {
                temp.add("");
            }
            list.add(temp);
        }

        dfs(root, 0, weight, 0);
        return list;
    }
}

public class LeetCode655 {
}
