package LeetCode.Middle.LeetCode1261;

import java.util.HashSet;
import java.util.Set;

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

class FindElements {
    private Set<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<>();
        DFS(root, 0);
    }

    private void DFS(TreeNode node, int value) {
        if (node == null) {
            return;
        }

        node.val = value;
        set.add(value);
        DFS(node.left, 2 * value + 1);
        DFS(node.right, 2 * value + 2);

    }

    public boolean find(int target) {
        return set.contains(target);
    }
}

public class LeetCode1261 {
}
