package LeetCode.Easy.LeetCode914;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode914
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 22:04
 * @Version 1.0
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int gcd(int x, int y) {
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = x; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int size = deck.length;

        for (int i = 0; i < size; i++) {
            if (map.containsKey(deck[i])) {
                map.put(deck[i], map.get(deck[i]) + 1);
            } else {
                map.put(deck[i], 1);
            }
        }
        int res = -1;
        for (Integer key : map.keySet()) {
            if (res == -1) {
                res = map.get(key);
                continue;
            }
            res = gcd(res, map.get(key));
            if (res < 2) {
                return false;
            }
        }
        return res >= 2;
    }
}

public class LeetCode914 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3})
        ;
    }
}
