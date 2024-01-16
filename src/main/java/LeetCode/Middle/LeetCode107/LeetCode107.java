package LeetCode.Middle.LeetCode107;

import java.util.*;

/**
 * @ClassName LeetCode107
 * @Description TODO
 * @Author point
 * @Date 2023/11/6 23:39
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> tempque = new LinkedList<>();
            List<Integer> temp = new ArrayList<>();

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    tempque.add(node.left);
                }
                if (node.right != null) {
                    tempque.add(node.right);
                }
                temp.add(node.val);
            }
            queue.addAll(tempque);
            list.add(temp);
        }
        Collections.reverse(list);
        return list;
    }
}

public class LeetCode107 {
}
