package LeetCode.Middle.LeetCode2583;

import java.util.*;

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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long temp = 0;
            Queue<TreeNode> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                temp += node.val;
                if (node.left!=null){
                    qqq.add(node.left);
                }
                if (node.right!=null){
                    qqq.add(node.right);
                }
            }
            list.add(temp);
            queue = qqq;
        }

        Collections.sort(list);
        if (k > list.size()) {
            return -1;
        }
        return list.get(list.size() - k);

    }
}

public class LeetCode2583 {
}
