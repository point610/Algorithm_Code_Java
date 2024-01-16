package LeetCode.Middle.LeetCode114;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode114
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 23:40
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
        list.add(node.val);
        DFS(node.left);
        DFS(node.right);
    }

    public void flatten(TreeNode root) {
        DFS(root);
        getFinal(root);
    }

    private void getFinal(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            root.left = null;
        }
        if (root.right != null) {
            root.right = null;
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            root.right = new TreeNode(list.get(i));
            root = root.right;
        }

    }
}

public class LeetCode114 {
}
