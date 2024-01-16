package LeetCode.Easy.LCP18;

import java.util.Arrays;

/**
 * @ClassName LCP18
 * @Description TODO
 * @Author point
 * @Date 2023/9/21 22:37
 * @Version 1.0
 */
class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int onesize = staple.length;
        int twosize = drinks.length;
        int res = 0;
        int right = twosize - 1;
        for (int i = 0; i < onesize; i++) {
            if (staple[i] > x) {
                break;
            }
            int mid = getMidNumber(drinks, x - staple[i], right);
            res = (res + mid) % 1000000007;
            right = mid - 1;
        }
        return res;
    }

    int getMidNumber(int[] drink, int limit, int right) {
        int left = 0;
        int mid = -1;
        int ans = -1;
        while (left <= right) {
            mid = (left + right) / 2;

            if (drink[mid] <= limit) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans + 1;
    }
}

public class LCP18 {
}

