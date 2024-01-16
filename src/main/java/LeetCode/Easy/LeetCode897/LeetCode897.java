package LeetCode.Easy.LeetCode897;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode897
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 15:28
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
        if (root.left == null && root.right == null) {
            return root;
        }
        DFS(root);
        int size = list.size();
        TreeNode head = new TreeNode();
        TreeNode point = head;
        for (int i = 0; i < size; i++) {
            point.right = new TreeNode(list.get(i));
            point = point.right;
        }

        return head.right;
    }
}

public class LeetCode897 {
}
