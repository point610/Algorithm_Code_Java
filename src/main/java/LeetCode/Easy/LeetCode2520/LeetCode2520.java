package LeetCode.Easy.LeetCode2520;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2520
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 13:05
 * @Version 1.0
 */
class Solution {
    List<Integer> getlist(int n) {
        List<Integer> list = new LinkedList<>();
        while (n != 0) {
            if (n % 10 != 0) {
                list.add(n % 10);
            }
            n /= 10;
        }
        return list;
    }

    public int countDigits(int num) {
        List<Integer> list = getlist(num);
        int sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (num % list.get(i) == 0) {
                sum++;
            }
        }return sum;
    }
}

public class LeetCode2520 {
}
