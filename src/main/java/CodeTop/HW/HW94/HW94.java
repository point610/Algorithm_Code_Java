package CodeTop.HW.HW94;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW94
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:30
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
    private List<Integer> list = new ArrayList<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        list.add(node.val);
        DFS(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        DFS(root);
        return list;
    }
}

public class HW94 {
}
