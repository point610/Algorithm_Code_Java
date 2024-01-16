package LeetCode.Easy.LCP07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LCP07
 * @Description TODO
 * @Author point
 * @Date 2023/9/20 23:38
 * @Version 1.0
 */
class Solution {
    int res = 0;

    int n = 0;

    Map<Integer, List<Integer>> map = new HashMap<>();

    void DFS(int k, int current) {
        if (k == 0) {
            if (current == n - 1) {
                res++;
            }
            return;
        }
        if (!map.containsKey(current)) {
            return;
        }
        List<Integer> list = map.get(current);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DFS(k - 1, list.get(i));
        }

    }

    public int numWays(int n, int[][] relation, int k) {
        this.n = n;
        int size = relation.length;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(relation[i][0])) {
                map.get(relation[i][0]).add(relation[i][1]);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(relation[i][1]);
                map.put(relation[i][0], temp);
            }
        }
        // 开始遍历
        DFS(k, 0);
        return res;

    }
}

public class LCP07 {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
