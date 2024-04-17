package LeetCode.Middle.LeetCode513;

import NKW_HW.two.HJ23.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = root.val;
        while (!queue.isEmpty()) {
            Queue<TreeNode> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    qqq.add(node.left);
                }
                if (node.right != null) {
                    qqq.add(node.right);
                }
            }
            if (!qqq.isEmpty()) {
                res = qqq.peek().val;
            }
            queue = qqq;
        }
        return res;
    }
}

public class LeetCode513 {
}









