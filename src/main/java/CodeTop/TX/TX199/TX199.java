package CodeTop.TX.TX199;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                if (queue.size() == 1) {
                    list.add(queue.peek().val);
                }
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    qqq.add(temp.left);
                }
                if (temp.right != null) {
                    qqq.add(temp.right);
                }
            }
            queue = qqq;
        }

        return list;
    }
}

public class TX199 {
}
