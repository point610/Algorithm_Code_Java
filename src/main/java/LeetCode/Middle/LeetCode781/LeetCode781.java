package LeetCode.Middle.LeetCode781;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private class Node {
        int nowhas;
        int max;

        public Node(int nowhas, int max) {
            this.nowhas = nowhas;
            this.max = max;
        }
    }

    public int numRabbits(int[] answers) {
        int res = 0;
        Map<Integer, Node> map = new HashMap<>();
        for (int ii : answers) {
            if (ii == 0) {
                res++;
            } else if (map.containsKey(ii)) {
                Node node = map.get(ii);
                node.nowhas++;
                map.put(ii, node);

                if (node.nowhas == node.max) {
                    // 重置
                    res += node.max;
                    node.nowhas = 0;
                    map.put(ii, node);
                }
            } else {
                Node node = new Node(1, ii + 1);
                map.put(ii, node);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key).nowhas == 0) {
                continue;
            }
            res += map.get(key).max;
        }


        return res;
    }
}

public class LeetCode781 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numRabbits(new int[]{0, 0, 1, 1, 1}));
        System.out.println(solution.numRabbits(new int[]{1, 1, 2}));
        System.out.println(solution.numRabbits(new int[]{10, 10, 10}));
    }
}





















