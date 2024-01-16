package LeetCode.Easy.LeetCode2231;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2231
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:31
 * @Version 1.0
 */
class Solution {
    public int largestInteger(int num) {
        List<Integer> jishu = new LinkedList<>();
        List<Integer> oushu = new LinkedList<>();

        StringBuilder isjishu = new StringBuilder();
        while (num != 0) {
            int temp = num % 10;

            if (temp % 2 == 1) {
                isjishu.append('y');
                jishu.add(temp);
            } else {
                isjishu.append('n');
                oushu.add(temp);
            }

            num /= 10;
        }
        Collections.sort(jishu, (o1, o2) -> o2 - o1);
        Collections.sort(oushu, (o1, o2) -> o2 - o1);

        isjishu.reverse();
        int sum = 0;
        int jiindex = 0;
        int ouindex = 0;
        int size = isjishu.length();
        for (int i = 0; i < size; i++) {
            sum *= 10;
            if (isjishu.charAt(i) == 'y') {
                sum += jishu.get(jiindex++);
            } else {
                sum += oushu.get(ouindex++);
            }

        }
        return sum;
    }
}

public class LeetCode2231 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestInteger(1234));
    }
}
