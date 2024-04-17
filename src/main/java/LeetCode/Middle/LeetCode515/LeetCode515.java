package LeetCode.Middle.LeetCode515;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> qqq = new LinkedList<>();
            int max = Integer.MIN_VALUE;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) {
                    qqq.add(node.left);
                }
                if (node.right != null) {
                    qqq.add(node.right);
                }
            }
            res.add(max);
            queue = qqq;
        }
        return res;
    }
}

public class LeetCode515 {
}
