package LeetCode.Middle.LeetCode173;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LeetCode173
 * @Description TODO
 * @Author point
 * @Date 2023/11/12 23:36
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

class BSTIterator {

    Queue<Integer> queue = new LinkedList<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        queue.add(node.val);
        DFS(node.right);
    }

    public BSTIterator(TreeNode root) {
        queue = new LinkedList<>();
        DFS(root);

    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

public class LeetCode173 {
}
