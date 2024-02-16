package CodeTop.TX.TX559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<Node> qqq = new LinkedList<>();
            max++;
            while (!queue.isEmpty()) {
                List<Node> children = queue.poll().children;
                if (children == null) {
                    continue;
                }
                for (Node child : children) {
                    qqq.add(child);
                }
            }
            queue = qqq;
        }

        return max;
    }
}

public class TX559 {
}
