package LeetCode.Middle.LeetCode103;

import java.util.*;

/**
 * @ClassName LeetCode103
 * @Description TODO
 * @Author point
 * @Date 2023/11/6 23:33
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean can = false;
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            Queue<TreeNode> tempqueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    tempqueue.add(node.left);
                }
                if (node.right != null) {
                    tempqueue.add(node.right);
                }
                temp.add(node.val);
            }

            queue.addAll(tempqueue);
            if (can) {
                Collections.reverse(temp);
            }
            list.add(temp);
            can = !can;
        }
        return list;
    }
}

public class LeetCode103 {
}
