package LeetCode.Middle.LeetCode89;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode89
 * @Description TODO
 * @Author point
 * @Date 2023/10/27 22:50
 * @Version 1.0
 */
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int head = 1;
        for (int i = 0; i < n; i++) {
            int size = list.size();
            for (int j = size - 1; j >= 0; j--) {
                list.add(head + list.get(j));
            }
            head <<= 1;
        }
        return list;
    }
}

public class LeetCode89 {
}
