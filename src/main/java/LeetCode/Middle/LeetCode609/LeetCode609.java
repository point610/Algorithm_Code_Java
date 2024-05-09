package LeetCode.Middle.LeetCode609;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private class Node {
        String fileName;
        String context;

        public Node(String fileName, String context) {
            this.fileName = fileName;
            this.context = context;
        }
    }

    private Node getNode(String one) {
        String[] split = one.split("\\(");
        Node node = new Node(split[0], split[1].substring(0, split[1].length() - 1));
        return node;
    }

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();

        for (String ss : paths) {
            String[] split = ss.split(" ");
            String pre = split[0];
            for (int i = 1; i < split.length; i++) {
                Node node = getNode(split[i]);
                if (map.containsKey(node.context)) {

                } else {
                    map.put(node.context, new ArrayList<>());
                }
                map.get(node.context).add(pre + "/" + node.fileName);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                list.add(map.get(key));
            }
        }
        return list;
    }
}

public class LeetCode609 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"}));
    }
}
