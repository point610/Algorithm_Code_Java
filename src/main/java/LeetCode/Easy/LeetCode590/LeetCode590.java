package LeetCode.Easy.LeetCode590;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode590
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 0:35
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
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }
        DFS(root);

        return list;
    }

    private void DFS(Node node) {

        if (node == null) {
            return;
        }

        int size = node.children.size();
        for (int i = 0; i < size; i++) {
            DFS(node.children.get(i));
        } list.add(node.val);

    }
}
public class LeetCode590 {
}
