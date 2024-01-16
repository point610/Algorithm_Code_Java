package LeetCode.Easy.LCR194;

import java.util.*;

/**
 * @ClassName LCR194
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 17:27
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
    Map<Integer, TreeNode> map = new HashMap<>();

    Set<Integer> set = new HashSet<>();

    // 记录父节点
    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            map.put(node.left.val, node);
            DFS(node.left);
        }
        if (node.right != null) {
            map.put(node.right.val, node);
            DFS(node.right);
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        DFS(root);
        while (p != null) {
            set.add(p.val);
            p = map.get(p.val);
        }
        while (q != null) {
            if (set.contains(q.val)) {
                return q;
            }
            q = map.get(q.val);
        }
        return null;

    }
}

public class LCR194 {
}
