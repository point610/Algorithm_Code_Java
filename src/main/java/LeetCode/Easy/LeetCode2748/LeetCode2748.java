package LeetCode.Easy.LeetCode2748;

/**
 * @ClassName LeetCode2748
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:09
 * @Version 1.0
 */
class Solution {
    boolean gcdisone(int a, int b) {
        int large = Math.max(a, b);
        int small = Math.min(a, b);
        for (int i = small; i >= 2; i--) {
            if (large % i == 0 && small % i == 0) {
                return false;
            }
        }
        return true;
    }

    int getfirst(int a) {
        return String.valueOf(a).charAt(0) - '0';
    }

    int getlast(int a) {
        return a % 10;
    }

    public int countBeautifulPairs(int[] nums) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (gcdisone(getfirst(nums[i]), getlast(nums[j]))) {
                    sum++;
                }
            }
        }
        return sum;
    }
}

public class LeetCode2748 {
}
