package LeetCode.Middle.LeetCode113;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode113
 * @Description TODO
 * @Author point
 * @Date 2023/11/6 23:43
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
    List<List<Integer>> list = new ArrayList<>();

    void addDFS(TreeNode node, int sum, int targetsum, List<Integer> temp) {
        if (node == null) {
            return;
        }
        sum += node.val;
        temp.add(node.val);
        if (node.left == null && node.right == null) {
            // yezi
            if (sum == targetsum) {
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        addDFS(node.left, sum, targetsum, new ArrayList<>(temp));
        addDFS(node.right, sum, targetsum, new ArrayList<>(temp));
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        addDFS(root, 0, targetSum, new ArrayList<>());
        return list;
    }
}

public class LeetCode113 {
}
