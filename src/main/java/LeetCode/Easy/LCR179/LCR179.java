package LeetCode.Easy.LCR179;

/**
 * @ClassName LCR179
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 22:51
 * @Version 1.0
 */
class Solution {
    public int[] twoSum(int[] price, int target) {
        int left = 0;
        int right = price.length - 1;
        while (left < right) {
            if (price[left] + price[right] == target) {
                return new int[]{price[left], price[right]};
            }
            if (price[left] + price[right] < target) {
                left++;
            } else if (price[left] + price[right] > target) {
                right--;
            }

        }
        return new int[0];
    }
}

public class LCR179 {
}
