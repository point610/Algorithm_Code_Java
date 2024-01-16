package LeetCode.Easy.LeetCode559;

import java.util.List;

/**
 * @ClassName LeetCode559
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 0:20
 * @Version 1.0
 */

class Node {
    public int val;

    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

class Solution {
    int max = 0;

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        root.val = 1;
        max=1;
        DFS(root);


        return max;
    }

    private void DFS(Node node) {
        if (node == null) {
            return;
        }

        int size = node.children.size();
        for (int i = 0; i < size; i++) {
            if (node.children.get(i) != null) {
                node.children.get(i).val = node.val + 1;
                max = Math.max(max, node.val + 1);
                DFS(node.children.get(i));
            }
        }
    }
}

public class LeetCode559 {
}
