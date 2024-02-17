package CodeTop.TX.TX257;

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
    private List<String> list;

    private void DFS(TreeNode node, String ss) {
        if (node == null) {
            return;
        }
        ss = ss + "->" + node.val;
        if (node.left == null && node.right == null) {
            list.add(ss);
        }
        DFS(node.left, ss);
        DFS(node.right, ss);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }
        DFS(root.left, String.valueOf(root.val));
        DFS(root.right, String.valueOf(root.val));
        return list;
    }
}

public class TX257 {
}
