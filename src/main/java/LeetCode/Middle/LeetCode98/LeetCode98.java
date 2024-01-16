package LeetCode.Middle.LeetCode98;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode98
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 23:36
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

    public boolean isValidBST(TreeNode root) {
        DFS(root);
        int size = list.size();
        if (size <= 1) {
            return true;
        }

        for (int i = 1; i < size; i++) {
            if (list.get(i - 1) >= list.get(i)) {
                return false;
            }
        }
        return true;

    }
}

public class LeetCode98 {
}
