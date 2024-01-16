package LeetCode.Easy.MS.MS0803;

/**
 * @ClassName MS0803
 * @Description TODO
 * @Author point
 * @Date 2023/10/11 23:49
 * @Version 1.0
 */
class Solution {
    public int findMagicIndex(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == i) {
                return i;
            }
        }return -1;
    }
}

public class MS0803 {
}
