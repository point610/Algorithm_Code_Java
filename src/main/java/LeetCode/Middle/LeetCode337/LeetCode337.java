package LeetCode.Middle.LeetCode337;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode337
 * @Description TODO
 * @Author point
 * @Date 2023/11/24 23:41
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
    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }

        int value = root.val;
        if (root.left != null) {
            value += (rob(root.left.left) + rob(root.left.right));
        }
        if (root.right != null) {
            value += (rob(root.right.left) + rob(root.right.right));
        }

        int res = Math.max(value, rob(root.left) + rob(root.right));
        map.put(root, res);
        return res;
    }
}

public class LeetCode337 {
}
