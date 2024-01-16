package LeetCode.Easy.LeetCode1742;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1742
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:50
 * @Version 1.0
 */
class Solution {
    int getnumbersum(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        int size = str.length();
        for (int i = 0; i < size; i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int number = getnumbersum(i);
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int max = 0;
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));

        }
        return max;

    }
}

public class LeetCode1742 {
}
