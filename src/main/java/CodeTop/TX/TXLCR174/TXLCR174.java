package CodeTop.TX.TXLCR174;

import java.util.Comparator;
import java.util.PriorityQueue;
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
    private Queue<Integer> queue;
    private int size;

    private void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        if (queue.size() < size) {
            queue.add(node.val);
        } else {
            if (node.val > queue.peek()) {
                queue.poll();
                queue.add(node.val);
            }
        }
        DFS(node.left);
        DFS(node.right);

    }

    public int findTargetNode(TreeNode root, int cnt) {
        this.queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        size = cnt;

        DFS(root);

        return queue.peek();
    }
}

public class TXLCR174 {
}
