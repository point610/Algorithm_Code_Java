package CodeTop.TX.TX692;

import java.util.*;

class Solution {
    class Node {
        String string;
        int times;

        public Node(String string, int times) {
            this.string = string;
            this.times = times;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Node> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(new Node(key, map.get(key)));
        }

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.times == o2.times) {
                    return o1.string.compareTo(o2.string);
                }
                return o2.times - o1.times;
            }
        });

        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(list.get(i).string);
        }

        return res;
    }
}

public class TX692 {
}
