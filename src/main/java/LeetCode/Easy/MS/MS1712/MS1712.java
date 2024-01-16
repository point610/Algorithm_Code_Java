package LeetCode.Easy.MS.MS1712;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName MS1712
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 16:05
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
    List<TreeNode> list = new ArrayList<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node);
        DFS(node.left);
        DFS(node.right);
    }

    public TreeNode convertBiNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        DFS(root);
        int size = list.size();
        Collections.sort(list, Comparator.comparingInt(o -> o.val));
        for (int i = 1; i < size; i++) {
            list.get(i - 1).left = null;
            list.get(i - 1).right = list.get(i);
        }
        list.get(size - 1).left = null;
        list.get(size - 1).right = null;
        return list.get(0);
    }
}

public class MS1712 {
}
