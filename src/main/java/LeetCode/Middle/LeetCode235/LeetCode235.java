package LeetCode.Middle.LeetCode235;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class Solution {
    private List<TreeNode> left;
    private List<TreeNode> right;
    private boolean leftfind;
    private boolean rightfind;

    private void DFSLL(TreeNode node, int value) {
        if (node == null || leftfind) {
            return;
        }
        left.add(node);
        if (node.val == value) {
            leftfind = true;
            return;
        }
        DFSLL(node.left, value);
        DFSLL(node.right, value);
        if (leftfind) {
            return;
        }
        left.remove(left.size() - 1);
    }

    private void DFSRR(TreeNode node, int value) {
        if (node == null || rightfind) {
            return;
        }
        right.add(node);
        if (node.val == value) {
            rightfind = true;
            return;
        }
        DFSRR(node.left, value);
        DFSRR(node.right, value);

        if (rightfind) {
            return;
        }

        right.remove(right.size() - 1);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        left = new ArrayList<>();
        right = new ArrayList<>();
        leftfind = false;
        rightfind = false;
        DFSLL(root, p.val);
        DFSRR(root, q.val);

        int index = 0;
        int minsize = Math.min(left.size(), right.size());
        while (index < minsize && left.get(index).val == right.get(index).val) {
            index++;
        }

        return left.get(index - 1);
    }
}

public class LeetCode235 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        root.left = p;
        root.right = q;
        solution.lowestCommonAncestor(root, p, q);
    }
}
