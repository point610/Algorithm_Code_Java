package LeetCode.Easy.LeetCode2160;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:49
 * @Version 1.0
 */
class Solution {
    public int minimumSum(int num) {

        int one = 0;
        int two = 0;
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (index % 2 == 0) {
                one *= 10;
                one += list.get(index);

            } else {
                two *= 10;
                two += list.get(index);

            }
            index++;

        }
        return one + two;
    }
}

public class LeetCode2160 {
}
