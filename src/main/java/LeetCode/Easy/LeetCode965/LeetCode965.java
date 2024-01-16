package LeetCode.Easy.LeetCode965;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode965
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 23:10
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
    Set<Integer> set = new HashSet<>();

    boolean single = true;

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        if (!set.contains(node.val)) {
            single = false;
            return;
        }
        DFS(node.left);
        DFS(node.right);
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        set.add(root.val);
        DFS(root.left);
        DFS(root.right);
        return single;

    }
}

public class LeetCode965 {
}
