package LeetCode.Middle.LeetCode133;

import java.util.*;

/**
 * @ClassName LeetCode133
 * @Description TODO
 * @Author point
 * @Date 2023/11/7 23:37
 * @Version 1.0
 */
class Node {
    public int val;

    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    Map<Integer, Node> map = new HashMap<>();

    Set<Integer> set = new HashSet<>();


    void init(Node node) {
        if (node == null) {
            return;
        }
        if (set.contains(node.val)) {
            return;
        }
        set.add(node.val);
        map.put(node.val, new Node(node.val));
        List<Node> neighbors = node.neighbors;
        for (Node n : neighbors) {
            init(n);
        }
    }

    void DFS(Node node) {
        if (node == null) {
            return;
        }
        if (set.contains(node.val)) {
            return;
        }
        set.add(node.val);
        Node current = map.get(node.val);
        List<Node> list = new ArrayList<>();
        List<Node> neighbors = node.neighbors;

        for (Node n : neighbors) {
            list.add(map.get(n.val));
        }
        current.neighbors = list;
        for (Node n : neighbors) {
           DFS(n);
        }
    }

    public Node cloneGraph(Node node) {
if (node==null){
    return null;
}
        init(node);
        set = new HashSet<>();
        DFS(node);
        return map.get(node.val);
    }
}

public class LeetCode133 {
}
