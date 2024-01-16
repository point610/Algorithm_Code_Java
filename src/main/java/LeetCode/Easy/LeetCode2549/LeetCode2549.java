package LeetCode.Easy.LeetCode2549;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2549
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:23
 * @Version 1.0
 */
class Solution {
    public int distinctIntegers(int n) {
        List<Integer> list = new LinkedList<>();
        list.add(n);
        for (int i = 0; i < 1000000000; i++) {
            int size = list.size();
            for (int j = 0; j < size; j++) {
                int number = list.get(j);
                for (int k = 2; k <= number - 1; k++) {
                    if (number % k == 1 && !list.contains(k)) {
                        list.add(k);
                    }
                }
            }
            if (size == list.size()) {
                break;
            }
        }
        return list.size();
    }
}

public class LeetCode2549 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distinctIntegers(3));
    }
}
