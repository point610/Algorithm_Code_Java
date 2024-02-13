package LeetCode.Hard.LeetCode987;

import java.util.*;

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
    private class lll {
        int value;
        int level;

        public lll(int value, int level) {
            this.value = value;
            this.level = level;
        }
    }

    private class Node {
        int value;
        List<lll> list;

        public Node(int value, List<lll> list) {
            this.value = value;
            this.list = list;
        }
    }

    private Map<Integer, Node> map;

    private void DFS(TreeNode node, int index, int level) {
        if (node == null) {
            return;
        }
        if (map.containsKey(index)) {
            map.get(index).list.add(new lll(node.val, level));
        } else {
            map.put(index, new Node(index, new ArrayList<>()));
            map.get(index).list.add(new lll(node.val, level));
        }
        DFS(node.left, index - 1, level + 1);
        DFS(node.right, index + 1, level + 1);

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map = new HashMap<>();

        DFS(root, 0, 0);

        List<Node> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(map.get(key));
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.value));

        for (Node node : list) {
            Collections.sort(node.list, (o1, o2) -> {
                if (o1.level == o2.level) {
                    return o1.value - o2.value;
                }
                return o1.level - o2.level;
            });

            List<Integer> tttt = new ArrayList<>();
            for (lll lll : node.list) {
                tttt.add(lll.value);
            }
            res.add(tttt);
        }
        return res;
    }
}

public class LeetCode987 {
}
