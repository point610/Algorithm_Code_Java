package LeetCode.Easy.LeetCode728;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode728
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 22:43
 * @Version 1.0
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (is(i)) {
                list.add(i);
            }
        }
        return list;

    }

    boolean is(int number) {
        List<Integer> singleNum = getSingleNum(number);
        int size = singleNum.size();
        for (int i = 0; i < size; i++) {
            if (singleNum.get(i) == 0) {
                return false;
            }
            if (number % singleNum.get(i) != 0) {
                return false;
            }
        }
        return true;
    }

    List<Integer> getSingleNum(int number) {
        List<Integer> list = new ArrayList<>();
        while (number != 0) {
            list.add(number % 10);
            number /= 10;
        }
        return list;
    }
}

public class LeetCode728 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.selfDividingNumbers(1, 22));
    }
}
