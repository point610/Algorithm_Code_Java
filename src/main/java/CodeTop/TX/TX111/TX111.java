package CodeTop.TX.TX111;

import java.util.LinkedList;
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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> qqq = new LinkedList<>();
            level++;
            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                if (temp.left == null && temp.right == null) {
                    return level;
                }
                if (temp.left != null) {
                    qqq.offer(temp.left);
                }
                if (temp.right != null) {
                    qqq.offer(temp.right);
                }
            }
            queue = qqq;
        }
        return -1;
    }
}

public class TX111 {
}
