package LeetCode.Easy.LeetCode2682;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2682
 * @Description TODO
 * @Author point
 * @Date 2023/8/16 0:03
 * @Version 1.0
 */
class Solution {
    public int[] circularGameLosers(int n, int k) {
        Set<Integer> set = new HashSet<>();
        int index = 1;
        int temp = 1;
        set.add(1);
        while (true) {
            temp = (temp + index * k-1) % (n )+1;
            index++;

            if (set.contains(temp)) {
                break;
            }
            set.add(temp);

        }
        int size = n - set.size();
        int[] res = new int[size];
        index = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                res[index++] = i;
            }
        }
        return res;
    }
}

public class LeetCode2682 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.circularGameLosers(2, 1);
    }
}
