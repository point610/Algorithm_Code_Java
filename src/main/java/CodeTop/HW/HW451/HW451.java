package CodeTop.HW.HW451;

import java.util.*;

/**
 * @ClassName HW451
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 19:48
 * @Version 1.0
 */
class Solution {
    private class Node {
        char cc;

        int times;

        public Node(char cc, int times) {
            this.cc = cc;
            this.times = times;
        }
    }

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character cc : s.toCharArray()) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }
        List<Node> list = new ArrayList<>();
        for (Character key : map.keySet()) {
            list.add(new Node(key, map.get(key)));
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.times - o1.times;
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for (Node nn : list) {
            for (int i = 0; i < nn.times; i++) {
                stringBuilder.append(nn.cc);
            }

        }

        return stringBuilder.toString();

    }
}

public class HW451 {
}
