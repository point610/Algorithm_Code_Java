package LeetCode.Middle.LeetCode910;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        //某一位开始需要减去k，之前的都是加上k
        int ans = nums[nums.length - 1] - nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            ans = Math.min(ans, possibleRange(nums, k, i));
        }
        return ans;
    }

    public int possibleRange(int nums[], int k, int p) {
        //计算的是从0到p需要加,p+1开始需要减去
        int max = Math.max(nums[p] + k, nums[nums.length - 1] - k);
        int min = Math.min(nums[0] + k, nums[p + 1] - k);
        return max - min;
    }
}

public class LeetCode910 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestRangeII(new int[]{1}, 0));
        System.out.println(solution.smallestRangeII(new int[]{0, 10}, 2));
        System.out.println(solution.smallestRangeII(new int[]{1, 3, 6}, 3));
    }
}
