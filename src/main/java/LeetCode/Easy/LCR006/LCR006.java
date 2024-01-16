package LeetCode.Easy.LCR006;

/**
 * @ClassName LCR006
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:09
 * @Version 1.0
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if ((numbers[left] + numbers[right]) == target) {
                break;
            }
            if ((numbers[left] + numbers[right]) < target) {
                left++;
            } else if ((numbers[left] + numbers[right]) > target) {
                right--;
            }
        }
        return new int[]{left, right};
    }
}

public class LCR006 {
}
