package LeetCode.Middle.LeetCode102;

import javax.xml.soap.Node;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        list.add(temp);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> qqq = new LinkedList<>();
            List<Integer> ttt = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    qqq.add(current.left);
                    ttt.add(current.left.val);
                }

                if (current.right != null) {
                    qqq.add(current.right);
                    ttt.add(current.right.val);
                }
            }
            if (!ttt.isEmpty()){
                list.add(ttt);
            }
            queue = qqq;
        }
        return list;
    }
}

public class LeetCode102 {
}
