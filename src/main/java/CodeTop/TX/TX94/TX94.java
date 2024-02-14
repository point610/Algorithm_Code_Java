package CodeTop.TX.TX94;

import java.util.ArrayList;
import java.util.List;

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
    private List<Integer> list;

    private void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        list.add(node.val);
        DFS(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        DFS(root);
        return list;
    }
}

public class TX94 {
}
