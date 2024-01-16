package CodeTop.HW.HW264;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW264
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 20:31
 * @Version 1.0
 */
class Solution {
    public int nthUglyNumber(int n) {

        int twoindex = 0;
        int threeindex = 0;
        int fiveindex = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < n; i++) {

            int temp = Math.min(Math.min(list.get(twoindex) * 2, list.get(threeindex) * 3), list.get(fiveindex) * 5);
            list.add(temp);
            if (temp == list.get(twoindex) * 2) {
                twoindex++;
            }
            if (temp == list.get(threeindex) * 3) {
                threeindex++;
            }
            if (temp == list.get(fiveindex) * 5) {
                fiveindex++;
            }
        }
        return list.get(n - 1);
    }
}

public class HW264 {
}
