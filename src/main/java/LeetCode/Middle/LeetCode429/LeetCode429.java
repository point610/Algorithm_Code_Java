package LeetCode.Middle.LeetCode429;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode429
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 0:42
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
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return list;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        list.add(temp);
        root.val = 1;

        DFS(root);

        return list;
    }

    private void DFS(Node node) {
        if (node == null) {
            return;
        }

        int size = node.children.size();
        if (size > 0 && list.size() <= node.val) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            if (node.children.get(i) != null) {
                list.get(node.val).add(node.children.get(i).val);
                node.children.get(i).val = node.val + 1;
            }
            DFS(node.children.get(i));
        }

    }

}

public class LeetCode429 {
}
