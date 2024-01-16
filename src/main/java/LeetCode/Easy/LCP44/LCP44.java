package LeetCode.Easy.LCP44;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LCP44
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 19:09
 * @Version 1.0
 */

class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    Set<Integer> set = new HashSet<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }

        set.add(node.val);
        DFS(node.left);
        DFS(node.right);
    }

    public int numColor(TreeNode root) {
        DFS(root);
        return set.size();
    }
}

public class LCP44 {
}
