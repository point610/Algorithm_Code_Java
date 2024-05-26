package LeetCode.Middle.LeetCode811;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Solution {
    private class Node {
        int times;
        String ss;

        public Node(int times, String ss) {
            this.times = times;
            this.ss = ss;
        }
    }

    private List<Node> getNode(String one) {
        String[] split = one.split(" ");
        List<Node> list = new ArrayList<>();
        int times = Integer.parseInt(split[0]);
        String[] sss = String.valueOf(new StringBuilder(split[1]).reverse()).split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sss.length; i++) {
            stringBuilder.append(sss[i]);
            Node node = new Node(times, stringBuilder.toString());
            list.add(node);
            stringBuilder.append(".");
        }

        return list;
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String one : cpdomains) {
            List<Node> list = getNode(one);
            for (Node node : list) {
                treeMap.put(node.ss, treeMap.getOrDefault(node.ss, 0) + node.times);
            }
        }

        List<String> res = new ArrayList<>();
        for (String key : treeMap.keySet()) {
            res.add(treeMap.get(key) + " " + new StringBuilder(key).reverse());

        }
        return res;
    }
}

public class LeetCode811 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
        System.out.println(solution.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wikipedia.org"}));
    }
}
