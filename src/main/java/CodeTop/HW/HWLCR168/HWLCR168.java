package CodeTop.HW.HWLCR168;

import java.util.*;

/**
 * @ClassName HWLCR168
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 19:50
 * @Version 1.0
 */
class Solution {

    public int nthUglyNumber(int n) {

        List<Integer> list = new ArrayList<>();
        int twoindex = 0;
        int threeindex = 0;
        int fiveindex = 0;
        list.add(1);
        for (int i = 1; i < n; i++) {
            int temp = Math.min(Math.min(list.get(twoindex) * 2, list.get(threeindex) * 3), list.get(fiveindex) * 5);
            list.add(temp);
            if (temp == list.get(twoindex) * 2) {
                twoindex++;
            }  if (temp == list.get(threeindex) * 3) {
                threeindex++;
            }  if (temp == list.get(fiveindex) * 5) {
                fiveindex++;
            }
        }
        return list.get(n - 1);
    }
}

public class HWLCR168 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nthUglyNumber(10));
        System.out.println(solution.nthUglyNumber(449));

    }
}
