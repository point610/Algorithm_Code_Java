package LeetCode.Easy.LCR052;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LCR052
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 22:08
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
    List<Integer> list = new ArrayList<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        list.add(node.val);
        DFS(node.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        DFS(root);
        int size = list.size();
        TreeNode node = new TreeNode();
        TreeNode point = node;
        for (int i = 0; i < size; i++) {
            point.right = new TreeNode(list.get(i));
            point = point.right;
        }
return node.right;    }
}

public class LCR052 {
}
