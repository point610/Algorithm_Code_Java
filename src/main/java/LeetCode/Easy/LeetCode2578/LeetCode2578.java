package LeetCode.Easy.LeetCode2578;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2578
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:03
 * @Version 1.0
 */
class Solution {
    public int splitNum(int num) {
        List<Integer> list = new LinkedList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        Collections.sort(list);

        int one = 0;
        int two = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                one *= 10;
                one += list.get(i);
            } else {
                two *= 10;
                two += list.get(i);
            }
        }

        return one + two;
    }
}

public class LeetCode2578 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.splitNum(4325));
    }
}
