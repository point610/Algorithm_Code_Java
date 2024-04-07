package LeetCode.Middle.LeetCode1600;

import NKW_HW.two.HJ23.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ThroneInheritance {
    private class Node {
        String name;
        boolean live;
        List<Node> children;

        public Node(String name, boolean live, List<Node> children) {
            this.name = name;
            this.live = live;
            this.children = children;
        }
    }

    private Node root;
    private Map<String, Node> map;

    public ThroneInheritance(String kingName) {
        root = new Node(kingName, true, new ArrayList<>());
        map = new HashMap<>();
        map.put(kingName, root);
    }

    public void birth(String parentName, String childName) {
        Node child = new Node(childName, true, new ArrayList<>());
        map.get(parentName).children.add(child);
        map.put(childName, child);
    }

    public void death(String name) {
        map.get(name).live = false;
    }

    public List<String> getInheritanceOrder() {
        List<String> res = new ArrayList<>();
        preorder(res, root);
        return res;
    }
    private void preorder(List<String> list, Node node) {
        if (node.live) {
            list.add(node.name);
        }
        for (Node child : node.children) {
            preorder(list, child);
        }

    }
}


public class LeetCode1600 {
}
